package demo.dan_li;

/**
 * 懒汉式单例
 * 用的时候创建一个对象，线程不安全
 *
 * @author Administrator
 */
class FootBall2 {
    private FootBall2() {}

    // 加volatile避免指令重排
    private static volatile FootBall2 fb;

    public static FootBall2 getFootBall() {
        if (fb == null) {
            synchronized (FootBall2.class) {
                if (fb == null) {
                    fb = new FootBall2();// 加volatile避免指令重排，导致可能返回半初始化的对象
                }
            }
        }
        return fb;
    }
}
