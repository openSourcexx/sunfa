package demo.sword_offer;

/**
 * 运行时间：21ms
 * 占用内存：9336k
 *
 * 运行时间：18ms
 * 占用内存：9276k
 */

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 * 0 1 1 2 3 5 8 13
 * a b a+b
 *
 * @author Administrator
 */
public class _斐波那契数列 {

    public static void main(String[] args) {
        int n = 30;
        int num = m1(n);
        System.out.println();
        System.out.println(num);
    }

    private static int m1(int n) {
        if (n == 0 || n > 39) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int a = 1;
            int b = 1;
            int c = 0;
            /**
             * 迭代：
             * 1 1 2 3 5
             * a b c
             *   a b c
             */
            for (int i = 2; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
            return c;
        }
    }
}
