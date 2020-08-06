package demo.suanfa;

import java.util.Arrays;
import java.util.List;

/**
 * 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] a = {51, 22, 83, 46, 75, 18, 68, 30};
        heapSort(a);
    }

    public static int[] heapSort(List<Integer> list) {
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        heapSort(a);
        return a;
    }

    public static void heapSort(int[] a) {
        // 最后一个非叶子结点a.length/2-1
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            // 建立大根堆
            heapSort(a, i, a.length);
            // System.out.println(Arrays.toString(a));
        }
        // 排序
        for (int i = a.length - 1; i > 0; i--) {
            // 元素交换,去掉大顶堆
            // 将大顶堆的根元素,放到数组的最后
            QuickSort.swap(a, 0, i);
            // 元素交换后,最后一个元素无需考虑
            heapSort(a, 0, i);
            // System.out.println(Arrays.toString(a));
        }
        // System.out.println(Arrays.toString(a));
    }

    private static void heapSort(int[] a, int i, int length) {
        // 将i值保存,后面可能会移动
        int temp = a[i];
        // 2i+1为左子树,2k+1为k的左子树
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            // 如果右子树存在,并且右子树大于左子树
            if (k + 1 < length && a[k] < a[k + 1]) {
                k++;
            }
            // 左右结点大于根,进行交换
            if (a[k] > temp) {
                QuickSort.swap(a, i, k);
                // 如果换了结点,以子结点为根的子树也会受影响
                i = k;
            } else {
                break;
            }
        }
    }

}
