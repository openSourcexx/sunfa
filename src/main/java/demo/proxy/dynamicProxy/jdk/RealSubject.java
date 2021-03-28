package demo.proxy.dynamicProxy.jdk;

/**
 * @author mango
 * @date 2021/3/26
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("dynamic RealSubject");
    }
}
