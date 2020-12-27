package cn.com.cdf.util;

import java.util.Random;

public class RandomUtil {

    public static int[] build(int len,int max){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }
}
