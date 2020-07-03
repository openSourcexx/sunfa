package demo.suanfa;

import java.util.Arrays;

/**
 * 快排
 *
 * @author Administrator
 * mylist=[51,22,83,46,75,18,68,30]
 * 第一次排序后结果：[30, 22, 18, 46, 51, 75, 68, 83]
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] list = {51, 22, 83, 46, 75, 18, 68, 30};
        int start = 0;
        int end = list.length - 1;
        quickSort(list, start, end);

        System.out.println(Arrays.toString(list));
    }

    public static void quickSort(int[] list, int start, int end) {
        if (end <= start) {
            return;
        }
        int i = start;
        int j = end;
        int key = list[i];
        while (i < j) {
            // 从右往左,找到比key小的就交换
            while (list[j] >= key && i < j) {
                j--;
            }
            swap(list, i, j);
            // 从左往右,找到比key大的就交换
            while (list[i] <= key && i < j) {
                i++;
            }
            swap(list, i, j);
        }
        quickSort(list, start, i - 1);
        quickSort(list, j + 1, end);

    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[j];
        list[j] = list[i];
        list[i] = temp;
    }
}
