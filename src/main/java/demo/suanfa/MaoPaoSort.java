package demo.suanfa;

import java.util.Arrays;

public class MaoPaoSort {
    /**
     * 冒泡排序：
     * 依次比较2个数，大的往后移
     * 时间：O(n^2)
     * 稳定
     */
    public static void main(String args[]) {
        int[] arry1 = {9, 8, 11, 7, 6};
        System.out.println("原序列：" + Arrays.toString(arry1));
        for (int i = 1; i < arry1.length; i++) {//有多少个数交换多少次
            for (int j = 0; j < arry1.length - 1; j++) {//如果前一个数>后一个数 两两交换
                if (arry1[j] > arry1[j + 1]) {
                    //交换a[j] a[j+1]
                    QuickSort.swap(arry1, j, j + 1);
                }
            }
        }
        System.out.println("冒泡排序：" + Arrays.toString(arry1));
    }
}
