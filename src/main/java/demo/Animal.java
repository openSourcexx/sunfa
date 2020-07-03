package demo;

public class Animal {
    String type; //����
    String name;  //����
    int age;  //����
    int weight;  //����

    void eat() {
        System.out.println("animal eat");
    }

    void breath() {
        System.out.println("animal breath");
    }

    void sleep() {
        System.out.println("animal sleep");
    }
}

class Tiger extends Animal {
    String tigerType;
    String from;

    void tigerRun() {
        System.out.println("the tiger run");
    }

    void breath() { //��������(��д)
        super.breath();//���ø���Animal��������
        System.out.println("�ϻ��÷κ���");
    }
}

class Fish extends Animal {
    String fishType;

    void swim() {
        System.out.println("����ˮ��");
    }

    void breath() { //��������
        System.out.println("����������");
    }
}

class Dog extends Animal {

}