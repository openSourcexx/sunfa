package demo.fengzhuang;

/**
 * ��װ�Ĳ��裺
 * 1.��������˽�л���ʹ��private�ؼ��ֽ������Σ�private��ʾ˽�У����ε���������ֻ���ٱ����з���
 * 2.�����ṩ�򵥵Ĳ�����ڣ��ⲿ��Ҫ����age���ԣ�����ͨ����Щ�򵥵���ڽ��з��ʡ�
 * ��ȡget
 * �޸�set
 * 3.set�����淶��
 * public void setAge(int a){
 * this.age = a;
 * }
 * 4.get�����淶��
 * public int getAge(){
 * return age;
 * }
 */
public class User {
    private int age;

    public void setAge(int a) {
        if (a < 0 || a > 150) {
            System.out.println("���䲻����");
            return;
        }
        age = a;
    }

    public int getAge() {
        return age;
    }
}
