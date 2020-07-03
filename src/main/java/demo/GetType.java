package demo;

public class GetType {
    public static void main(String[] args) {
        long k = 9;
        float a = k;
        double b = a;
        System.out.println(k + getType(k));
        System.out.println(a + getType(a));
        System.out.println(b + getType(b));
    }

    public static String getType(Object o) {
        return o.getClass()
            .toString();
    }

    public static String getType(int o) {
        return "int";
    }

    public static String getType(byte o) {
        return "byte";
    }

    public static String getType(short o) {
        return "short";
    }

    public static String getType(char o) {
        return "char";
    }

    public static String getType(float o) {
        return "float";
    }

    public static String getType(double o) {
        return "double";
    }

    public static String getType(long o) {
        return "long";
    }
}
