package demo.mianshi;

class JuXing {
    private double chang;
    private double kuan;

    public void setChang(double chang) {
        this.chang = chang;
    }

    public double getChang() {
        return chang;
    }

    public void setKuan(double kuan) {
        this.kuan = kuan;
    }

    public double getKuan() {
        return kuan;
    }

    double Area() {
        return chang * kuan;
    }
}

class ChangFaTi extends JuXing {
    private double gao;

    public void setGao(double gao) {
        this.gao = gao;
    }

    public double getGao() {
        return gao;
    }

    double tiji() {
        return Area() * gao;
    }
}

public class E2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JuXing a = new JuXing();
        ChangFaTi c = new ChangFaTi();
        c.setChang(9.0);
        c.setKuan(6.0);
        c.setGao(2.0);
        System.out.println(c.tiji());
    }

}
