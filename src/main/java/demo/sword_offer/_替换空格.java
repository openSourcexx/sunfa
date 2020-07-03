package demo.sword_offer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 *
 * @author Administrator
 */
public class _替换空格 {
    public static void main(String[] args) {
        String str = "We Are Happy";
        str = replace(str);
        System.out.println(str);
    }

    private static String replace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (cc == ' ') {
                sb.append("%20");
            } else {
                sb.append(cc);
            }
        }
        return sb.toString();
    }
}
