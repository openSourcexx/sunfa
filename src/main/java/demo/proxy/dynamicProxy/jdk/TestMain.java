package demo.proxy.dynamicProxy.jdk;

/**
 * @author mango
 * @date 2021/3/26
 */
public class TestMain {
    public static void main(String[] args) {
        JdkProxyHandler proxyHandler = new JdkProxyHandler();
        Subject subject = (Subject) proxyHandler.bind(new RealSubject());
        subject.doSomething();
    }
}
