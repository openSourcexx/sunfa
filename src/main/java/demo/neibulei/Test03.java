package demo.neibulei;

public class Test03 {

    public static void main(String[] args) {
        Computer03 com = new Computer03();
        System.out.println(com);

        Computer03 com2 = new Computer03.Builder().builder();
        System.out.println(com2);

        Computer03 com3 = new Computer03.Builder().setColor("red")
            .setCoreNum(8)
            .setMemorySize(16)
            .setPrice(100)
            .setModel("ass")
            .builder();
        System.out.println(com3);
    }

}
