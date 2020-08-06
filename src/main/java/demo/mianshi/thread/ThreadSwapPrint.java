package demo.mianshi.thread;

/**
 * 交替打印
 *
 * @author admin
 * @since 2.1.0 2020/7/17 10:48
 */
public class ThreadSwapPrint {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    m.subT();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    m.mainT();
                }
            }
        }).start();
    }
}

class MyThread extends Thread {
    boolean flag = true;
    int i = 0;

    public synchronized void subT() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i++;
        if (i % 2 != 0) {
            System.out.println(Thread.currentThread()
                .getName() + ":" + i);
            flag = true;
            this.notify();
        }
    }

    public synchronized void mainT() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i++;
        if (i % 2 == 0) {
            System.out.println(Thread.currentThread()
                .getName() + ":" + i);
            flag = false;
            this.notify();
        }
    }
}
