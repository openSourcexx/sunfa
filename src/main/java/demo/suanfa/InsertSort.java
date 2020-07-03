package demo.suanfa;

import java.util.Arrays;

/**
 * 快排
 *
 * @author Administrator
 * mylist=[51,22,83,46,75,18,68,30]
 * 第一次排序后结果：[30, 22, 18, 46, 51, 75, 68, 83]
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {51, 22, 83, 46, 75, 18, 68, 30};
        m2(a);
        System.out.println(Arrays.toString(a));
    }

    private static void m2(int[] a) {
        //插入排序
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j])
                    QuickSort.swap(a, i, j);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
