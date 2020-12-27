package cn.com.cdf.sort;

import cn.com.cdf.util.RandomUtil;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * 时间复杂度为O(n^2)
 */
public class BubbleSort {

    public static void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            //有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //因为有元素交换，所以不是有序的，标记为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;


            }
        }
    }

    public static void main(String[] args) {
        int[] array = RandomUtil.build(10, 100);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
