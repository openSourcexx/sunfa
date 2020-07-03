package demo.sword_offer;

import java.util.Arrays;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author Administrator
 */
public class _二位数组中的查找 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        if (findTarget(arr, 19)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        ;
    }

    private static boolean findTarget(int[][] arr, int target) {
        /**
         * 从最左下角的数key，比key大右移，比key小上移
         */
        int rowIndex = arr.length;
        int colIndex = arr[0].length;
        int i, j;
        for (i = rowIndex - 1, j = 0; i >= 0 && j < colIndex; ) {
            if (target == arr[i][j]) {
                return true;
            }
            if (target > arr[i][j]) {
                j++;
                continue;
            }
            if (target < arr[i][j]) {
                i--;
                continue;
            }
        }
        return false;
    }
}
