package demo.letcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * @author Administrator
 */
public class _最长公共前缀 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        // TODO Auto-generated method stub
        String strs[] = {"flower", "flow", "flight"};
        int len = strs[0].length();
		/*for(int i = 1;i < strs.length - 1;i++){
			int len = strs[i].length();
			if(min > len){
				min = len;
			}
		}*/
        for (String str : strs) {
            len = Math.min(len, str.length());
        }
        String res = "";
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            char cc = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (cc != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += cc;
            }
        }
        System.out.println(res);
    }
}
