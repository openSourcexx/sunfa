package demo.suanfa;

import java.util.Arrays;

/**
 * 数组中插入一个数x
 * 1.新建一个长度+1的数组newArray，假设在array[index]出插入x
 * 2.将源数组插入前的数复制给新数组
 * 3.插入该数，将array[index]赋给newArray[index]
 * 4.将array[index]后的数赋值给新数组
 */
public class Array_InsortANum {

    public static void main(String[] args) {
        int[] array = {1, 2, 6, 3, 4, 5};
        int[] newArray = insortArray(array, 3, 666);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] insortArray(int[] array, int index, int j) {
        //1.
        int[] newArray = new int[array.length + 1];
        int i = 0;
        //2.
        for (; i < index; i++) {
            newArray[i] = array[i];
        }
        //3.
        newArray[i] = j;
        //4.
        for (; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

}
