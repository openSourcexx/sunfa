package demo.dan_li;

/**
 * 饿汉式单例
 * 不管用不用先创建一个对象，线程安全
 *
 * @author Administrator
 */
class FootBall {
    private FootBall() {}

    private static FootBall fb = new FootBall();

    public static FootBall getFootBall() {
        return fb;
    }

    public static void main(String[] args) {
        FootBall fb = null;
        for (int i = 0; i < 100; i++) {
            fb = FootBall.getFootBall();
            System.out.println(fb);
        }
    }
}
