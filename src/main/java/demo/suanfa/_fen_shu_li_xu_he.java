package demo.suanfa;

/**
 * 求2/1，3/2，5/3，8/5，13/8...求出这个数列的前20项之和
 * b/a a+b/b
 *
 * @author Administrator
 * a=1,b=2,b/a,c=b=2,b=a+b=3,a=c=2
 * 3/2,c=3,b=5,a=3
 */
public class _fen_shu_li_xu_he {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double a = 1, b = 2, t;
        double s = 0;
        for (int i = 1; i <= 20; i++) {

            s += b / a;
            System.out.println(b + "/" + a + " += " + s);//n=b/a;
            t = b;
            b = a + b;
            a = t;//关键，主要将b间接赋给a
            //System.out.println(s);
        }
    }

}
