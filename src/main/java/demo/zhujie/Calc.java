package demo.zhujie;

import java.util.Arrays;

public class Calc {
    public static void main(String[] args) {
        int[] arr = {51, 22, 83, 46, 75, 18, 68, 30};
        //		maopao(arr);
        //		select(arr);
        //		insort(arr);
        //		binary(arr,11);
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr, 0, arr.length - 1);

    }

    private static void quickSort(int[] arr, int start, int end) {
        int key = arr[start];
        while (start < end) {
            if (arr[end] > key) {
                end--;
            } else {
                int temp = arr[end];
                arr[end] = key;
                key = temp;
            }
            if (arr[start] < key) {
                start++;
            } else {
                int temp = arr[start];
                arr[start] = key;
                key = temp;
            }
        }
        System.out.println(Arrays.toString(arr));//[30, 22, 18, 46, 51, 75, 68, 83]

    }

    private static void binary(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < key) {
                start = mid;
            } else {
                end = mid;
            }
        }
    }

    private static void insort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void select(int[] arr) {
        //每次选择最小的
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void maopao(int[] arr) {
        //		System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //		System.out.println(Arrays.toString(arr));

    }

}
