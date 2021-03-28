package demo.proxy.dynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 如果代理抽象类则必须是代理子类已实现的方法
 * @author mango
 * @date 2021/3/28
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 前置
        System.out.println("aa");
        Object ret = methodProxy.invoke(target, objects);
        // 后置
        System.out.println("bb");
        return ret;
    }
}
