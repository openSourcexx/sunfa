package demo;

public class Recursion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(sum01(5));
        System.out.println(jianChen01(4));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int sum01(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int jianChen(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jianChen(n - 1);
        }
    }

    public static int jianChen01(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

}
