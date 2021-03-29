package demo.jvm.metaspace;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * 在启动的时候设置元空间的大小:
 *
 * -XX:MaxMetaspaceSize=200m
 *
 * @author safe
 * @date 2021/3/20
 */
public class MetaSpaceTest {
    public static void main(String[] args) {
        for (; ; ) {
            Enhancer e = new Enhancer();
            e.setSuperclass(MetaSpaceTest.class);
            e.setUseCache(false);
            e.setCallback((MethodInterceptor) (Object, method, args1, proxy) -> proxy.invoke(Object, args1));
            System.out.println("creating...");
            e.create();
        }
    }
}
