package demo.suanfa;

import java.util.Arrays;

/**
 * 数组逆序
 *
 * @author Administrator
 */
public class ArrayReverse {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        revers(array);
        System.out.println(Arrays.toString(array));
    }

    private static void revers(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {    //循环次数为数组一半
            //交换第1位和最后一位
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
    }

}
