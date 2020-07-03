package demo.neibulei;

/**
 * 娴嬭瘯闈欐�佸唴閮ㄧ被
 *
 * @author Administrator
 */
public class Test02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Outer02 outer02 = new Outer02();
        //閫氳繃绫诲悕璁块棶璇ョ被鐨勯潤鎬佸彉閲�
        System.out.println(Outer02.b);
        //閫氳繃绫诲悕璁块棶璇ョ被鐨勯潤鎬佹柟娉�
        Outer02.staticMethod02();

        //閫氳繃闈欐�佸唴閮ㄧ被鍒涘缓瀵硅薄
        new Outer02.Inner02();
        //閫氳繃寮曠敤鍙兂闈欐�佸唴閮ㄧ被瀵硅薄
        Outer02.Inner02 inner02 = new Outer02.Inner02();

    }

}
