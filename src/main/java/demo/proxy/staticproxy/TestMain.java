package demo.proxy.staticproxy;

/**
 * @author mango
 * @date 2021/3/26
 */
public class TestMain {
    public static void main(String[] args) {
        Subject subject = new SubProxy();
        subject.doSomething();
    }
}
