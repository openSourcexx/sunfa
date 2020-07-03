package demo.jicheng;

public class _face_diffcult {
    private String baseName = "base";

    public _face_diffcult() {
        callName();
    }

    public void callName() {

        System.out.println("1" + baseName);
    }

    static class Suber extends _face_diffcult {
        private String baseName = "suber";
        int a = 4;

        public void callName() {
            System.out.println("2" + baseName + a);
        }
    }

    public static void main(String[] args) {
        new _face_diffcult();
        new Suber();
    }
}
