package demo.mianshi.thread.cuc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author admin
 * @since 2.1.0 2020/7/21 17:45
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        CDLTask cdlTask = new CDLTask(countDownLatch);
        System.out.println("比赛开始");
        new Thread(cdlTask,"运动员A").start();
        new Thread(cdlTask,"运动员B").start();
        new Thread(cdlTask,"运动员C").start();
        new Thread(cdlTask,"运动员D").start();
        // 等待所有线程到达终点后再输出此句
        countDownLatch.await();
        System.out.println("比赛结束");
    }
}

class CDLTask implements Runnable {
    private CountDownLatch countDownLatch;

    public CDLTask(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread()
            .getName() + "开始跑步");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread()
            .getName() + "到达终点");
        countDownLatch.countDown();
    }
}

