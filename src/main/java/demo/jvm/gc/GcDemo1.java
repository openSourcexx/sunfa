package demo.jvm.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xmn4m -Xms20m -Xmx20m -XX:+PrintGCDetails
 * -Xmn4m(-X memory、new):设置新生代大小为4m
 * -Xms20m(-X memory、size):设置jvm初始堆大小20m
 * -Xmx20m(-X memory、max):设置最大可用内存大小20m
 *
 * @author taqo
 * @date 2021/3/29
 */
public class GcDemo1 {
    /** 4m */
    private final static int BYTE_SIZE = 4 * 1024 * 1024;

    public static void main(String[] args) {
        List<Object> List = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            List.add(new byte[BYTE_SIZE]);
            System.out.println(i);
        }
    }
}
