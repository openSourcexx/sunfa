package demo.suanfa;

import java.util.Arrays;

/**
 * 插入排序：分为有序和无序数组
 *
 * @author Administrator
 * mylist=[51,22,83,46,75,18,68,30]
 * //把正在排序的数值a[i]赋值为temp,循环比较a[i]与前面所有的已排好的a[i-1]的值，大的向后移，返回当前插入的位置a[i]
 * 时间：O(n^2)
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {51, 22, 83, 46, 75, 18, 68, 30};
        // m2(a);
        // System.out.println(Arrays.toString(a));
        System.out.println(a.length); // 8
    }

    private static void m2(int[] a) {
        //插入排序
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            if (a[i - 1] > temp) {
                while (i > 0 && a[i - 1] > temp) {
                    a[i] = a[i - 1];
                    i--;
                }
                a[i] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
