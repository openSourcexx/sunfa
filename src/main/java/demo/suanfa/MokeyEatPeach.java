package demo.suanfa;

/**
 * 猴子第一天摘下若干个桃，当即吃了一半，不过瘾，又多吃了一个，
 * 第二天有奖剩下的桃子吃掉哟版，有多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。直第10天只剩一个，求第一天共摘了多少/
 * 1534
 *
 * @author Administrator
 */
public class MokeyEatPeach {

    //递归
    static int eatPeatch(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (eatPeatch(n - 1) + 1) * 2;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * n=1 10
         * n=(n+1)*2= s=4 9
         * n=(n+1)*2=    s=10 8
         * n=(11)*2=22   s=22
         * 2036		s=
         */
        //System.out.println(eatPeatch(10));
        int n = 1, s = 0;
        for (int i = 10; i >= 1; i--) { //第10-i天有s个
            System.out.println("第" + i + "天：" + n);
            s += n;
            n = (n + 1) * 2;

        }
		
		
		/*int day=9,x1,x2=1;
		while(day>0){
			x1 = (x2+1)*2;
			x2=x1;
			day--;
		}*/
    }
}
