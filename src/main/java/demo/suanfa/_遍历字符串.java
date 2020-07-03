package demo.suanfa;

public class _遍历字符串 {
    public static void main(String[] args) {
        String str = "asdfg sadgf";
        m1(str);
        System.out.println();
        m2(str);
        System.out.println();
        m3(str);

    }

    private static void m3(String str) {
        // toArrays
        char[] cc = str.toCharArray();
        for (char c : cc) {
            System.out.print(c);
        }

    }

    private static void m2(String str) {
        //substring
        for (int i = 0; i < str.length(); i++) {
            String cc = str.substring(i, i + 1);
            System.out.print(cc);
        }

    }

    private static void m1(String str) {
        //charAt();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            System.out.print(cc);
        }
    }
}
