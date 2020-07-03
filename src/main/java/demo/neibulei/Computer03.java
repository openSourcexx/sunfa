package demo.neibulei;

/**
 * ͨ����̬�ڲ�������вι��캯��
 *
 * @author Administrator
 */
public class Computer03 {
    private String model;
    private int price;
    private String color;
    private int coreNum;
    private int memorySize;

    @Override
    public String toString() {
        return "Computer03 [model=" + model + ", price=" + price + ", color=" + color + ", coreNum=" + coreNum
            + ", memorySize=" + memorySize + "]";
    }

    public Computer03() {

    }

    //1)���徲̬�ڲ��࣬���ĳ�Ա�������ⲿ���Ա��ȫһ��
    public static class Builder {
        private String model;
        private int price;
        private String color;
        private int coreNum;
        private int memorySize;

        //2)���ڲ������ñ���seter����
        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setCoreNum(int coreNum) {
            this.coreNum = coreNum;
            return this;
        }

        public Builder setMemorySize(int memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        //3)�ڲ����ṩ�ⲿ�෽���������ⲿ��Ķ���
        public Computer03 builder() {
            return new Computer03(this);//new
        }
    }

    //4)�����ⲿ�๹�췽��������ʱ�ڲ������
    private Computer03(Builder builder) {
        this.model = builder.model;
        this.price = builder.price;
        this.color = builder.color;
        this.coreNum = builder.coreNum;
        this.memorySize = builder.memorySize;
    }

}
