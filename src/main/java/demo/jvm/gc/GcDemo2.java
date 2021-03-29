package demo.jvm.gc;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.date.DateUtil;

/**
 * -Xmn50m -Xms100m -Xmx100m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/tmp/heapdump.hprof
 * 使用 jconsole
 *
 * @author taqo
 * @date 2021/3/29
 */
public class GcDemo2 {
    private final static int BYTE_SIZE = 5 * 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
        List<Object> List = new ArrayList<Object>();
        for (int i = 0; i < 1000; i++) {
            // Thread.sleep(2000);
            List.add(new byte[BYTE_SIZE]);
            System.out.println(DateUtil.now() + ":" + i);
        }
    }
}
