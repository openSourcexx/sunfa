package demo.zhujie;

public class FootBall {
    private FootBall() {

    }

    private static FootBall fb = new FootBall();

    public static FootBall getBall() {

        return fb;
    }
}
                