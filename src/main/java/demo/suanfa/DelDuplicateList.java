package demo.suanfa;

/*
 * 给定数组 nums = [1,1,2], 

函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 

你不需要考虑数组中超出新长度后面的元素。*/
public class DelDuplicateList {
    public static void main(String args[]) {
        int[] a = {1, 1, 2};
        System.out.println(removeDuplicates(a));
    }

    public static int removeDuplicates(int[] a) {
        if (a == null || a.length == 0)
            return 0;
        int index = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[index] = a[i];
                index++;
            }
        }
        return index;
    }
}
