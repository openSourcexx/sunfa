package demo.mianshi;

import java.util.Scanner;

public class T2 {
    public static int Mi(int m, int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = m * a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������:");
        int m = sc.nextInt();
        System.out.println("����η�:");
        int n = sc.nextInt();
        System.out.println(Mi(m, n));
    }
}