package demo.suanfa;

import java.util.Arrays;

/**
 * 选择排序：每次选择最小的
 * 时间：O(n^2)
 * 稳定
 */
public class SelectSort {
    public static void main(String[] args) {
        int min, temp, key;
        int[] array = {5, 9, 11, 4, 6, 1, 3};
        System.out.println("原序列：" + Arrays.toString(array));

        for (int i = 0; i <= array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j <= array.length - 1; j++) {//这里是j=i+1
                //向后遍历,如果后面有比a[min]更小的，min=j,min始终指向最小的数
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            //交换a[i],a[min]
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println("选择排序：" + Arrays.toString(array));
    }
}
