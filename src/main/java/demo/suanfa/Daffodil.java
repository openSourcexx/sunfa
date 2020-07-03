package demo.suanfa;

import java.util.Scanner;

//判断一个三位数是否为水仙花数，
//一个数等于各位数的立方和就是水仙花数。如153==1*1*1 + 5*5*5 + 3*3*3
public class Daffodil {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个3位数的数:");
        int n = sc.nextInt();
        int a, b, c, result;
        a = n % 10;//个位
        b = (n / 10) % 10;//十位
        c = (n / 100) % 10;//百位
        result = a * a * a + b * b * b + c * c * c;
        if (result == n) {
            System.out.println("该数是水仙花数");
        } else {
            System.out.println("该数不是水仙花数");
        }
    }

}
