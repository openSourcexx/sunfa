package demo.suanfa;

import java.util.Arrays;

/**
 * 随机产生10个[10-50]的正整数存到数组中，要求数组中的元素中不能有重复的
 *
 * @author Administrator
 */
public class Random_Norepeate_Array {

    public static void main(String[] args) {
        int[] arry = new int[5];

        for (int i = 0; i < arry.length; i++) {//产生n个
            //随机10-50数
            int num = (int) (Math.random() * 40 + 10);
            //如果num已经在arry中，重新产生随机数
            while (exitNum(num, arry)) {
                num = (int) (Math.random() * 40 + 10);
            }
            arry[i] = num;
        }
        System.out.println(Arrays.toString(arry));
    }

    private static boolean exitNum(int num, int[] arry) {
        for (int i : arry) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }
}
