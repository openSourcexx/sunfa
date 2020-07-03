package demo.jicheng;

/**
 * java�̳�˳��
 * 1.���ྲ̬���з���>2.���ྲ̬���еķ���>3.�������ͨ����>4.���๹�췽��>5.�������ͨ����>6.����Ĺ��췽��
 * ��̬��ִֻ��һ��
 */

class Person {
    int i = 0;//ʵ������

    //��̬��
    static {
        System.out.println("����ľ�̬��");
    }

    //���췽��
    Person() {
        System.out.println("����Ĺ��췽��");
    }

    //��ͨ����
    {
        System.out.println("�������ͨ����");
    }
}

class Student extends Person {
    int i = 2;

    static {
        System.out.println("����ľ�̬��");
    }

    Student() {
        System.out.println("����Ĺ��췽��");
    }

    {
        System.out.println("�������ͨ����");
    }

}

public class Test01 {

    public static void main(String[] args) {
        //		 TODO Auto-generated method stub
        Person stu = new Person();//������ʱ����̬��;�̬�����ͻ�ִ�У���new
        System.out.println();
        Person stu1 = new Student();
        Student stu2 = new Student();
		
		/*����ľ�̬�� 
		����ľ�̬��
		�������ͨ����
		����Ĺ��췽��
		�������ͨ����
		����Ĺ��췽��
		
		�������ͨ����
		�������ͨ����
		�������ͨ����
		����Ĺ��췽��*/
    }

}
