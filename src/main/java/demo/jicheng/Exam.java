package demo.jicheng;

class HelloA {
    //���췽��
    public HelloA() {
        System.out.println("HelloA");
    }

    //��ͨ����
    {
        System.out.println("i'm A class");
    }

    static {
        System.out.println("static A");
    }

    static void show() {
        System.out.println("����show����");
    }
}

public class Exam extends HelloA {
    Exam() {
        System.out.println("HelloB");
    }

    {
        System.out.println("i'm B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Exam ex = new Exam();//������ʱ����̬��;�̬�����ͻ�ִ��
        ex = null;//static���εķ������߱���Ҳ���Բ��á�����.���ķ�ʽ���ʣ��������е�ʱ��Ͷ��ڴ浱�еĶ����޹�
        ex.show();
		/*static A
		static B
		i'm A class
		HelloA
		i'm B class
		helloB*/
    }

}
