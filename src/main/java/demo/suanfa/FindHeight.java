package demo.suanfa;

/**
 * 一球从100米高度自由落下，每次落地后反弹高度为原来的一半，在落下
 * 求第10次落地时，共经过多少米？第10次反弹多高
 */
public class FindHeight {
    public static void main(String[] args) {
        double h = 100.0, s = 0;
        for (int i = 2; i <= 11; i++) {
            /**
             * i=1,h=100,s=100
             * i=2,h=50,s=s+50*2=200 1
             * i=3;h=25.5,s=s+25.5*2  2
             * s=s+h*2
             * i=2,s=200,h=50 1
             * i=3,s=s+50*2,h=25.5  2
             *
             */
            s = s + h * 2;
            h = h / 2;
        }
        System.out.println(s);
    }
}
