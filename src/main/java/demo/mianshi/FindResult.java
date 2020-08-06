package demo.mianshi;

/**
 * Jvm分为局部变量表,操作数栈,动态链表,方法出口,其它
 * https://tieba.baidu.com/p/6794193778
 */
public class FindResult {

    public static void main(String[] args) {
        m1();
        // m2();
    }

    private static void m1() {
        int i = 0;
        FindResult findResult = new FindResult();
        findResult.fermin(i);//方法出栈
        i = i++;//将i+1赋值给临时局部变量,但是操作栈中i仍是0,将操作栈中i值赋值给局部变量i,即i=0,i操作3次
        System.out.println(i);//0
        mtemp();
    }

    private static void mtemp() {
        int i = 0;
        FindResult findResult = new FindResult();
        findResult.fermin(i);//方法出栈
        int temp = i++;//将i+1赋值给临时局部变量temp,但是操作栈中i仍是0,将操作栈中i值赋值给局部变量i,即i=0
        System.out.println("temp:" + temp);//0
        System.out.println("i:" + i);//0
    }

    private static void m2() {
        int i = 0;
        FindResult findResult = new FindResult();
        findResult.fermin(i);//方法出栈
        int j = i++;//将i赋值给局部变量j,然后执行i=i+1
        // i在局部变量表中变成了2，操作数栈中的 i 值为1，并且将 i 的值返回给 j，即此条语句以后，i = 2，j = 1
        System.out.println(i);//1
        System.out.println(j);//0
    }

    void fermin(int i) {//i是形参局部变量，该方法出栈后i消失
        i++;
    }

}
