package demo.mianshi;

class Mokey {
    private String name;

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Mokey(String s) {
        this.name = s;
    }

    public void speak() {
        System.out.println("����ѽѽ......");
    }
}

class People extends Mokey {
    public void speak() {
        System.out.println("С���ģ��������˵���ˣ�");
    }

    public void think() {
        System.out.println("��˵��������˼����");
    }

    /*People(){
        super("s");*/ //"s"...Ϊɶ....���ݸ�name
    People(String s) {
        super(s);//s���ø���money���캯��
    }
}

public class E {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Mokey m = new Mokey("To");
        System.out.println(" ���Ǻ���" + m.getname());
        m.speak();
        People cc = new People("sad");
        System.out.println("������" + cc.getname());
        cc.speak();
        cc.think();
    }

}
