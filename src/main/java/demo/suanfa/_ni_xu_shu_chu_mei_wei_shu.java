package demo.suanfa;

import java.util.Scanner;

/**
 * ������������1.����ʱ��λ����2.�����ӡÿλ��
 *
 * @author Administrator
 */
public class _ni_xu_shu_chu_mei_wei_shu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 19234, eachnum, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入n:");
        n = sc.nextInt();
        /**
         * 个位n%10
         * 十位n/10%10
         * 百位n/100%10
         */
        for (int i = 1; i <= n; i *= 10) {
            eachnum = n / i % 10;
            count++;
            System.out.print(eachnum);
        }
        System.out.println("第" + count + "位");
    }

}
