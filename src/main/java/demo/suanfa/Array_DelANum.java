package demo.suanfa;

/**
 * int[][] list = new int[2][2];
 * int[][] list = {{1,2},{3,4}};
 *
 * @author Administrator
 */
public class Array_DelANum {

    public static void main(String[] args) {
        int[][] list2 = new int[4][3];//4行3列
        list2[2] = new int[] {5, 6};//将{5,6}存到list第3行
        int[][] list = {{1, 2}, {3, 4, 5, 6}, {5, 2, 3}};

        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                System.out.print(list2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

	
