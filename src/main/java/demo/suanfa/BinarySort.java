package demo.suanfa;

import java.util.Arrays;

/**
 * 前提是已经由小到大排好序
 * {1,2,3,4,5}
 *
 * mid = (start + end)/2
 * int key = 3;
 * start<=end 一直找下去
 * if(key > list[mid]){//key在mid的右边
 * start = mid + 1
 * mid = (start + end)/2
 * }
 * key =
 * if(key < list[mid]){//key在mid的左边
 * end = mid - 1
 * mid = (start + end)/2
 * }
 * key == list[mid]
 *
 * @author Administrator
 */
public class BinarySort {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        Arrays.sort(list);
        System.out.println(binarySort(list, 4));
    }

    private static int binarySort(int[] list, int key) {
        int start = 0;
        int end = list.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list[mid] == key) {
                //				System.out.println(mid);
                return mid;
            } else if (list[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
