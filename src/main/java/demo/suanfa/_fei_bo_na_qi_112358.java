package demo.suanfa;

/**
 * 有一对兔子,从出生起第3个月起每个月生一对兔子，兔不死，求兔子总数
 * 1 1 2 3 5 8 11...
 * a b c
 * a b c
 */
public class _fei_bo_na_qi_112358 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        System.out.print("1 1 ");
        for (int i = 1; i <= 8; i++) {//8个月
            c = a + b;//前2个月赋给第三个月
            a = b;//前2个月赋给第三个月
            b = c;
            System.out.print(c + " ");
        }
    }
}
