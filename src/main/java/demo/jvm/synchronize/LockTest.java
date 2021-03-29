package demo.jvm.synchronize;

import java.util.stream.IntStream;

import org.openjdk.jol.info.ClassLayout;

/**
 * 前提:-XX:BiasedLockingStartupDelay=0 设置延迟锁参数为0 偏向锁的运行时间
 *
 * 当一个锁升级为重量级锁之后，任何线程再来争抢之后会走重量级锁的逻辑。
 * 不会再从无锁到偏向锁到轻量级锁再到重量级锁。
 *
 * 结果:
 * 4个线程同时竞争变成了重量级锁。
 * 4个线程执行完毕之后，锁对象变成了无锁。
 * 此时再有一个线程去争抢锁，就从无锁变成了轻量级锁。
 * 所以当重量级锁释放了之后，锁对象是无锁的！
 * 有新的线程来竞争的话又会从轻量级锁开始！
 *
 * @author safe
 * @date 2021/3/20
 */
public class LockTest {
    static Object obj;

    public static void main(String[] args) throws InterruptedException {
        obj = new Object();
        System.out.println(obj.toString());
        System.out.println("无锁时对象布局:" + ClassLayout.parseInstance(obj)
            .toPrintable());// 为什么一开始就是偏向锁
        Thread.sleep(1000L);
        IntStream.rangeClosed(1, 4)
            .forEach(i -> getLock());// 多线程抢锁
        Thread.sleep(5000L);
        System.out.println("无竞争后，此时锁对象布局:" + ClassLayout.parseInstance(obj)
            .toPrintable()); // 无锁
        getLock();//再次观察锁状态 // 偏向锁或者无锁或者重量级锁
        Thread.sleep(5000L);
        getLock();//再次观察锁状态 // 偏向锁或者无锁或者重量级锁
    }

    private static void getLock() {
        new Thread(() -> {
            synchronized (obj) {
                System.out.println("线程:" + Thread.currentThread()
                    .getName() + ",重量级锁状态对象布局:" + ClassLayout.parseInstance(obj)
                    .toPrintable());
            }
        }).start();
    }
}
