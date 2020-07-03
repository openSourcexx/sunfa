package demo.jicheng;

class T1 {
    int i = 0;

    //һ�㷽������Ҫ����.������ִ��
    public void Test1() {
        System.out.println(i);
    }

    public void Test2() {
        System.out.println(i);
    }

    //��ͨ��������������ʱֱ��ִ��
    {
        System.out.println("���Ǹ���T1��ͨ����");
    }

    T1() {
        System.out.println("����T1���췽��");
    }
}

public class T2_YiBanMethod extends T1 {
    int i = 2;

    public void Test2() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        T1 test = new T2_YiBanMethod();
        //һ�㷽��ʹ��--����ִ�й�������.�������������������.ʵ������
        test.Test1();
        test.Test2();//���෽�����Ǹ��෽��
        //System.out.println(test.i);
        T2_YiBanMethod t2 = new T2_YiBanMethod();
        System.out.println(t2.i);
    }

}
