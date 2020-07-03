package demo.sword_offer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * f(n)表示从任意位置向上跳n个台阶的跳法个数，当从第一个台阶向上跳时，可以先跳一个，也可以先跳两个:跳一个时，则后续跳法为f(n-1)个；跳两个时，后续跳法为f(n-2),
 * 故f(n)=f(n-1)+f(n-2)
 * f(1)=1
 * f(2)=2
 *
 * @author Administrator
 */
public class _跳台阶 {

    public static void main(String[] args) {
        int n = 5;
        int m = m1(n);
        System.out.println(m);
    }

    private static int m1(int n) {
        int a = 1, b = 2, c = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;

        }

    }

}
