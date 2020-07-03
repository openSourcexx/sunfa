package demo.jicheng;

class Instrument {
    void play() {
        System.out.println("����������");
    }
}

class Wind extends Instrument {
    void play() {
        System.out.println("����Wind!");
    }

    void play2() {
        System.out.println("����wind��play2");
    }
}

class Brass extends Instrument {
    //��дplay
    void play() {
        System.out.println("����brass");
    }

    void play2() {
        System.out.println("����brass��play2");
    }
}

public class Test03 {
    static void tune(Instrument i) {
        i.play();
    }

    public static void main(String[] args) {
        Wind w = new Wind();
        Brass b = new Brass();
        tune(w);
        tune(b);
		
		/*����wind
		����brass*/
    }
}
