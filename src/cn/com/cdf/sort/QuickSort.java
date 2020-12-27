package cn.com.cdf.sort;

import cn.com.cdf.util.RandomUtil;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    /**
     * 分治（单边循环）
     * @param arr
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partition(int[] arr, int startIndex, int endIndex){
        int mark = startIndex;
        //基准元素
        int pivot = arr[startIndex];

        for (int i = startIndex + 1; i < endIndex; i++) {
            if (arr[i] < pivot) {
                mark++;
                int temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }
        //交换基本元素和mark元素
        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }

    public static void sort(int[] arr, int startIndex, int endIndex){
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partition(arr, startIndex, endIndex);
        sort(arr,startIndex,pivotIndex-1);
        sort(arr,pivotIndex+1,endIndex);
    }

    public static void main(String[] args) {
        int[] array = RandomUtil.build(10, 100);
        System.out.println(Arrays.toString(array));
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

}
