package demo.proxy.staticproxy;

/**
 * @author mango
 * @date 2021/3/26
 */
public class SubProxy implements Subject {
    Subject subject = new RealSubject();
    @Override
    public void doSomething() {
        subject.doSomething();
    }
}
