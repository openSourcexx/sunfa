package demo.neibulei;

/**
 * Son类实现多继承
 * Son类继承A类，可以使用A类方法，想使用B类方法
 * 1.Son类中创建内部类Inner继承B类
 * 2.内部类Innet重写B类的方法methodB，创建对象调用B类的方法 new Inner().methodB();
 *
 * @author Administrator
 */

public class Test1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Son son = new Son();
        son.methodA1();
        son.methodB1();
    }
}
