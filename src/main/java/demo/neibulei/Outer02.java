package demo.neibulei;

/**
 * 静态内部类
 * 1）使用static修饰的成员内部类就是静态内部类
 * 2）在静态内部类中不能直接是使用外部类的实例成员，可以直接访问外部的静态变量及方法
 * 3）在静态内部类中可以定义静态成员
 *
 * @author Administrator
 */
public class Outer02 {
    int a = 10;                    //实例变量
    static int b = 20;            //静态实例变量

    //静态方法
    public static void staticMethod02() {
        System.out.println("staticMethod02静态成员方法调用静态成员变量b:" + b + "\t不能调用非静态成员变量a");
        //在静态内部方法中，可以使用静态内部类
        Inner02 obj = new Inner02();
        obj.innerMethod02();
    }

    //静态内部类
    static class Inner02 {
        int c = 30;

        //内部成员方法
        public void innerMethod02() {
            //静态内部类成员方法不能调用外部类非晶态成员变量，可以直接访问外部类的静态成员变量
            System.out.println("静态内部类成员方法 访问 外部类静态成员 b:" + b);
            System.out.println("静态内部类成员方法 访问 内部类成员成员 c:" + c);
        }

        static int dd = 40;        //静态内部类定义静态变量

        public static void innerStaticMethod() {
            System.out.println("静态内部类的静态方法");
        }
    }

    //成员内部类
    class Inner002 {

    }
}
