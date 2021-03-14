package demo.letcode;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * @author Administrator
 */
public class _反转整数 {
    public static void main(String[] args) {
        System.out.println(reverse(-12233221));
    }

    public static int reverse(int x) {
        x = (x < 0 ? -x : x);
        int count = 0;
        while (x != 0) {
            // int temp = x % 10;
            count = count * 10 + x % 10;
            x /= 10;
        }
        if (x < 0) {
            return count = -count;
        }
        return count;
    }
}
