package demo.suanfa;

import java.util.Arrays;

/**
 * System.arraycopy()和Arrays.copyof()效率比较
 *
 * @author Administrator
 */
public class _arraycopy_copyof执行效率 {
    public static void main(String[] args) {

        char[] arr = new char[100000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 'a';
        }
        test(arr);
    }

    private static void test(char[] arr) {
        //System.arraycopy
        char[] newArr = new char[arr.length];
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        long end = System.currentTimeMillis();
        System.out.println("System.arraycopy-->" + (end - start));//55

        //Arrays.copyof()
        char[] newArr2 = Arrays.copyOf(arr, arr.length);
        long end2 = System.currentTimeMillis();
        System.out.println("Arrays.copyof()-->" + (end2 - end));//118

    }
}
