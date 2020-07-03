package demo.neibulei;

public class Son extends OuterA1 {
    private class Inner extends OuterB1 {
    }

    public void methodB1() {
        System.out.print("son内部类间接调用B类方法");
        new Inner().methodB1();
    }

}
