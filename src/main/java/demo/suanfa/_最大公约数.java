package demo.suanfa;

import demo.neibulei.Test1;

public class _最大公约数 {
    public static void main(String[] args) {
        int m1 = 28;
        int n1 = 21;
        int m = Math.max(m1, n1);
        int n = Math.min(m1, n1);
        int b = m1 * n1;
        while (n != 0) {
            int k = m % n;
            m = n;
            n = k;
        }
        System.out.println("最大公约数" + m);
        System.out.println("最小公倍数" + b / m);
    }
}
