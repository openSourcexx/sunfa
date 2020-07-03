package demo.mianshi;

class Test {

    public static void main(String[] args) {
        /**
         * finally语句在try或catch中的return语句执行之后返回之前执行且finally里的修改语句不能影响try或catch中 return已经确定的返回值，
         * 若finally里也有return语句则覆盖try或catch中的return语句直接返回。
         *
         * 1.finally中有return语句，当try执行到return时会执行finally中的代码，其中有return 就直接返回了，如题，返回值为3.
         2.finally中不含return语句，那么当执行到return时，它会被保存等待finally执行完毕后返回，
         这个时候无论finally内部如何改变这个值，都不会影响返回结果！
         */
        System.out.println(func());
    }

    @SuppressWarnings("finally")
    public static int func() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
