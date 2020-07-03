package demo.suanfa;

/**
 * 输入90，打印出90=2*3*3*5
 *
 *
 * 1.i=2,i<=n,i++,找出能被n整除的第一位数i，输出i,将商赋给n(n=n/i)
 * 2.如果这个质数==n，分解质数结束，输出n
 *
 * @author Administrator
 */
public class _fen_jie_zheng_yin_shu {
    public static void main(String[] args) {
        int n = 90;
        System.out.print(n + "=");
        for (int i = 2; i <= n; i++) {
            while (i != n) {
                if (n % i == 0) {//1.如果n能被i整除，输出因子i，将上赋值给n继续找因子
                    System.out.print(i + "*");
                    n = n / i;
                } else {//n不能被i整除，结束当前while循环
                    //System.out.print(i+"*");
                    break;
                }
            }
        }//2.当n==i结束for循环输出最后一位因子n
        System.out.println(n);
    }
}
