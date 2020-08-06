package demo.mianshi;

/**
 * 假设有50瓶饮料，喝完三个空瓶可以换一瓶饮料，依次类推，请问总共喝了多少饮料
 * @author admin
 * @since 2.1.0 2020/7/16 21:38
 */
public class Bottle {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        int n = 50;
        int i = 0;
        while (true) {
            n-=3;
            i++;
            if (n<3) {
                System.out.println("共喝了"+(50+i));
                break;
            }
        }
    }
}
