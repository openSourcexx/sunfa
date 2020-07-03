package demo;

public class ArryCopy3 {
    public static void main(String args[]) {
        int[] arry1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arry2 = new int[20];
        for (int i = 0; i < 10; i++)
            arry2[i] = 10 * i;
        System.arraycopy(arry1, 0, arry2, 10, arry1.length);
        /**
         *    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         src:Դ����; srcPos:Դ����Ҫ���Ƶ���ʼλ��;
         dest:Ŀ������; destPos:Ŀ��������õ���ʼλ��;
         length:���Ƶĳ���.
         */
        for (int i = 0; i < arry2.length; i++) {
            System.out.println(arry2[i]);
        }
    }
}
