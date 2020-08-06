package demo.mianshi;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

import demo.suanfa.QuickSort;

public class Test {

    public static void main(String[] args) throws IOException {
        int[] a = {10,29,38,40,44};
        s(a);

    }

    private static int s(int[] a) {
        int start = 0;
        int end = a.length-1;
        int k = 44;
        while (start <= end){
            int mid = (start + end) /2;
            if (a[mid] == k) {
                System.out.println(mid);
                return mid;
            } else if(a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(-1);
        return  -1;
    }

    private void read(String path, String tab) {
        File src = new File(path);
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(tab + file.getName());
            }
            if (file.isDirectory()) {
                System.out.println(file.getName());
                read(file.getPath(), tab + "\t");
            }
        }
    }

    private static void heapSort(int[] a, int i, int length) {
        int temp = a[i];
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            if (k + 1 < length && a[k + 1] > a[k]) {
                k++;
            }
            if (a[k] > temp) {
                QuickSort.swap(a, i, k);
                i = k;
            } else {
                break;
            }
        }
    }
}
