package demo.mianshi;

/**
 * for(exp1;exp2;exp3){
 * exp4;
 * }
 * 先执行exp1;
 * exp2为true;执行exp4;在执行exp3
 * 如果exp1不符合exp2;执行exp3
 *
 * @author Administrator
 */
public class for_order {

    public static boolean out(char c) {
        System.out.println(c);
        return true;
    }

    public static void main2(String[] args) {
        int i = 0;
        for (out('a'); out('b') && i < 2; out('c')) {//a b d c b d c b
            i++;
            out('d');
        }
    }

}
