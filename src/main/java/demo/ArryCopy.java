package demo;

public class ArryCopy {
    public static void main(String args[]) {
        //����2������
        int[] arry1 = {1, 2, 3};
        int[] arry2 = {4, 5, 6};
        System.out.println("��Ӧ�����ֵ:");
        for (int i = 0; i < arry1.length; i++) {
            System.out.println("arry1[" + i + "]=" + arry1[i]);
        }
        for (int j = 0; j < arry2.length; j++) {
            System.out.println("arry2[" + j + "]=" + arry2[j]);
        }
        arry1 = arry2;//���鿽��
        //��ӡ��������
        System.out.println("ִ�п���������������ֵ");
        for (int i = 0; i < arry1.length; i++) {
            System.out.println("arry1[" + i + "]=" + arry1[i]);
        }
        for (int i = 0; i < arry2.length; i++) {
            System.out.println("arry2[" + i + "]=" + arry2[i]);
        }
        arry2[0] = 10;
        System.out.println("arry2[0]=" + arry2[0]);
    }
}
