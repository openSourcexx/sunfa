package demo.mianshi;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author admin
 * @since 2.1.0 2020/7/15 13:57
 */
public class Bin {
    private final ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println();
        // int[] a = {1,88,29,10,12};
        // System.out.println(bin(a,9));
        // final int j=0;

    }

    private static int bin(int[] a, int key) {
        for (int i = 0;i<a.length-1;i++){
            for (int j = 0;j<a.length-1;j++){
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        return 0;
    }
}
