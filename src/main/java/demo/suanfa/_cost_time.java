package demo.suanfa;

/**
 * 计算toCharArray()和charAt()运行时间/效率比较
 *
 * @author Administrator
 */
public class _cost_time {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        String s = "a";
        for (int i = 0; i < 100000; i++) {
            s += "a";
        }
        //toCharArray()花费时间
        long start = System.currentTimeMillis();
        char[] cs = s.toCharArray();
        for (char c : cs) {
            System.out.println(" ");
        }
        long end = System.currentTimeMillis();

        //charAt()花费时间
        //		long start2 = System.currentTimeMillis();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            System.out.println(" ");//println是线程同步的
        }
        long end2 = System.currentTimeMillis();

        //substring()花费时间
        //		 s1;
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i, i + 1);
            System.out.println("");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("toCharArray()time-->" + (end - start));
        System.out.println("charAt()time-->" + (end2 - end));
        System.out.println("substringtime-->" + (end3 - end2));

    }

}
