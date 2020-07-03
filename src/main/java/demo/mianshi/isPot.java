package demo.mianshi;

public class isPot {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*дһ���������ж������Ƿ���2���ݣ�����ԭ�����£�
		public static  boolean  isPOT( int num )��*/
        System.out.println(isPots(4));
    }

    public static boolean isPots(int num) {
        if (num < 2) {
            return false;
        }
        while (num != 1) {
            if (num % 2 != 0) {
                return false;
            }
            num /= 2;//֮ǰ��return true�ŵ����������ˣ�����
        }
        return true;
    }
}
