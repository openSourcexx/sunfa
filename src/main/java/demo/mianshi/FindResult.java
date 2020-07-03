package demo.mianshi;

public class FindResult {

    public static void main(String[] args) {
        FindResult findResult = new FindResult();
        int i = 0;
        findResult.fermin(i);//方法出栈
        i = i++;//这里是先运行程序，所以先i<-0，再i+1
        System.out.println(i);//0

    }

    void fermin(int i) {//i是形参局部变量，该方法出栈后i消失
        i++;
    }

}
