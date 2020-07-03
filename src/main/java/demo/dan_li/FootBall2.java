package demo.dan_li;

/**
 * 懒汉式单例
 * 用的时候创建一个对象，线程不安全
 *
 * @author Administrator
 */
class FootBall2 {
    private FootBall2() {}

    private static FootBall2 fb;

    public static FootBall2 getFootBall() {
        if (fb == null) {
            synchronized (FootBall2.class) {
                if (fb == null) {
                    fb = new FootBall2();
                }
            }
        }
        return fb;
    }
}
