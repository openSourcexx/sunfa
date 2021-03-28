package demo.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mango
 * @date 2021/3/26
 */
public class JdkProxyHandler implements InvocationHandler {
    private Object tar;

    public Object bind(Object tar) {
        this.tar = tar;
        return Proxy.newProxyInstance(tar.getClass()
            .getClassLoader(), tar.getClass()
            .getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        System.out.println("aa");
        result = method.invoke(tar, args);
        //在调用具体函数方法后，执行功能处理
        System.out.println("bb");
        return result;
    }
}
