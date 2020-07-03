package demo;

public class IfKuoHao {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 7;
        if (i > 5) {
            System.out.println("i=" + i);
            //i=3;
            System.out.println("change i,i=" + i);
        }
        if (i > 5)//���if��������������һ��ִ�У�if����������ִ��
            System.out.println("second i,i=" + i);
        i = 4;
        System.out.println("second change i=" + i);
        System.out.println("asdas");
    }

}
