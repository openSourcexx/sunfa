package demo.mianshi;

/**
 * 父类静态块>子类静态块>父类普通方法>父类构造方法>子类普通方法>子类构造方法
 * @author admin
 * @since 2.1.0 2020/7/11 19:55
 */
public class ClazzInitSort {
    public static void main(String[] args) {
        Father f = new Son();// ADBCEF
        System.out.println("==");
        Son s = new Son(); // BCEF
    }
}
class Father{
    static {
        System.out.print("A");
    }

    {
        System.out.print("B");
    }

    public Father() {
        System.out.print("C");
    }
}

class Son extends Father{
    static {
        System.out.print("D");
    }

    {
        System.out.print("E");
    }

    public Son() {
        System.out.print("F");
    }
}

