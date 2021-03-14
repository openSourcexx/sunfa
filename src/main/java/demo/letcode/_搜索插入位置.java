package demo.letcode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * @author safe
 * @date 2021/3/2
 */
public class _搜索插入位置 {
    public static void main(String[] args) {
        int num[] = {1,3,5,6};
        int start = 0;
        int end = num.length - 1;
        int k = 7;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (k == num[mid]) {
                break;
            } else if (k < num[mid]) {
                end = mid -1;
            } else if (k > num[mid]) {
                start = mid +1;
            }
        }
        System.out.println(mid);
    }
}
