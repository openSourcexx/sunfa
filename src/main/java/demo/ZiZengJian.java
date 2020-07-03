package demo;

public class ZiZengJian {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * �ڼ��� x ֵʱ������ִ��ǰ׺������a ��ֵ��Ϊ 6����ִ�г˲�����
         �Ӷ��õ����Ϊ 12�������� y ֵʱ���Ƚ��г�����������õ���� 10��Ȼ���Ƹ� y���Ӷ�
         �õ����Ϊ 10��Ȼ��Ž��������������Ӷ��õ� b ��ֵΪ 6��
         * */
        int a = 5;
        int b = 5;
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("���������ǰ׺�����a=" + a + "���ʽx=" + x);// -->a:6,x:12
        System.out.println("�����������׺�����b=" + b + "���ʽy=" + y);// -->b:6,y:10
        a++;
        System.out.println(a);//-->a:7
    }

}
