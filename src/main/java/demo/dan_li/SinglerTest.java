package demo.dan_li;

public class SinglerTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread()
                        .getName() + ":" + FootBall.getFootBall());
                }
            }).start();
        }
    }
}
