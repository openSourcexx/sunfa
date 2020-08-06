package demo.mianshi.thread.cuc;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author admin
 * @since 2.1.0 2020/7/21 19:29
 */
public class SemaPhoreTaskDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        SPT spt = new SPT(semaphore);
        for (int i = 0;i<10;i++) {
            new Thread(spt,"工人"+i).start();
        }
    }
}

class SPT implements Runnable {
    private Semaphore semaphore;

    public SPT(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        int i = 2;
        try {
            semaphore.acquire(i);
            System.out.println(Thread.currentThread()
                .getName() + "生产2个设备");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread()
                .getName() + "生产完毕,释放设备");
            semaphore.release(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
