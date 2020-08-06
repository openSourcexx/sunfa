package demo.angerbird;

/**
 * ������
 *
 * @author Administrator
 */
public class SlingShot {
    //��������֮�����ڷ�
    public void shoot(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        int i = 10;
        // i = i++;
        i++;
        System.out.println(i);
    }
}
