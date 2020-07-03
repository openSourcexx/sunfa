package demo.suanfa;

import java.util.Scanner;

/**
 * 回文数：121，1221，12321
 *
 * @author Administrator
 */
public class _hui_wen_shu {
    public static void HuiWen(int n) {
        int temp = 0, eachNum;
        for (int i = 1; i <= n; i *= 10) {
            eachNum = n / i % 10;
            temp = temp * 10 + eachNum;
            //			System.out.println(temp);
        }
        if (temp == n) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //int a=121,temp=0,eachNum;
        /**
         * 回文数：121
         * 1
         * 12=10*1+2
         * 121=12*10+1
         */
		/*for(int i = 1;i <= a;i*=10){
			eachNum = a/i%10;//每位数
			temp = temp*10 +eachNum;
			System.out.println(temp);
		}*/
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数：");
        int n = sc.nextInt();
        HuiWen(n);
    }

}
