package demo.mianshi.thread.cuc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @author admin
 * @since 2.1.0 2020/7/21 19:14
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, () -> {
            System.out.println("当前线程为:" + Thread.currentThread()
                .getName());
        });
        Cbd cbd = new Cbd(cyclicBarrier);
        for (int i = 0; i < 4; i++) {
            new Thread(cbd, "写线程" + i).start();
        }
    }
}

class Cbd implements Runnable {
    private CyclicBarrier cyclicBarrier;

    public Cbd(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread()
            .getName() + "正在写入数据...");
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread()
                .getName() + "写入数据完毕,等待其它数据写入");
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程执行完毕,继续恢复执行");
    }
}
