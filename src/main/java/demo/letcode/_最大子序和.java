package demo.letcode;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 *
 * @author safe
 * @date 2021/3/2
 */
public class _最大子序和 {
    public static void main(String[] args) {
        int num[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {
                sum += num[j];
                max = Math.max(sum,max);
            }
        }

        System.out.println(max);
    }
}
