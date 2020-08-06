package demo.mianshi.thread;

/**
 * @author admin
 * @since 2.1.0 2020/7/11 12:53
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(() -> {
            synchronized ("1") {
                System.out.println("线程a获得锁1,同时想获得锁2");
                synchronized ("2") {
                    System.out.println("线程a获得锁1后获得锁2");
                }
            }
        }).start();
        new Thread(() -> {
            synchronized ("2") {
                System.out.println("线程b获得锁2,同时想获得锁1");
                synchronized ("1") {
                    System.out.println("线程b获得锁2后获得锁1");
                }
            }
        }).start();
    }
}

class DeadThreadTest extends Thread {
    @Override
    public void run() {
        if ("a".equals(Thread.currentThread()
            .getName())) {
            synchronized ("1") {
                System.out.println("线程a获得锁1,同时想获得锁2");
                synchronized ("2") {
                    System.out.println("线程a获得锁1后获得锁2");
                }
            }
        }
        if ("b".equals(Thread.currentThread()
            .getName())) {
            synchronized ("2") {
                System.out.println("线程b获得锁2,同时想获得锁1");
                synchronized ("1") {
                    System.out.println("线程b获得锁2后获得锁1");
                }
            }
        }
    }
}
