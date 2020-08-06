package demo.mianshi;

/**
 * @author admin
 * @since 2.1.0 2020/7/11 20:06
 */
public class Base {
    private String baseName = "base";

    public Base() {
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    static class SubBase extends Base {
        private String baseName = "sub";

        @Override
        public void callName() {
            System.out.println(baseName);
        }

        public SubBase() {
            System.out.println("sub cons");
        }
    }

    public static void main(String[] args) {
        SubBase subBase = new SubBase();
        System.out.println();
    }
}
