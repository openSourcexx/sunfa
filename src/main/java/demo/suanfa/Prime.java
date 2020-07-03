package demo.suanfa;

public class Prime {
    public static boolean isPrime(int k) {
        int flag = 1;
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {//不是素数返回0
                flag = 0;
                break;//加break
            }
        }
        if (flag == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

