package demo.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author mango
 * @date 2021/3/28
 */
public class Main {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy(new Subject());
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(proxy);
        enhancer.setSuperclass(Subject.class);
        Subject subject = (Subject) enhancer.create();
        subject.aa();
    }
}
