package demo.dan_li;

public class xxx {

    public static void main(String[] args) {
		/*bbb t1 = new bbb();
		bbb t2 = new bbb();
		t1.setName("a");
		t2.setName("b");
		t1.start();
		t2.start();*/
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                if ("a".equals(Thread.currentThread()
                    .getName())) {
                    synchronized ("a") {
                        System.out.println(Thread.currentThread()
                            .getName() + "获得a,想要获得b");
                        synchronized ("b") {
                            System.out.println(Thread.currentThread()
                                .getName() + "获得a,也获得b");
                        }
                    }
                }
                if ("b".equals(Thread.currentThread()
                    .getName())) {
                    synchronized ("b") {
                        System.out.println(Thread.currentThread()
                            .getName() + "获得b,想要获得a");
                        synchronized ("a") {
                            System.out.println(Thread.currentThread()
                                .getName() + "获得b,也获得a");
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                if ("a".equals(Thread.currentThread()
                    .getName())) {
                    synchronized ("a") {
                        System.out.println(Thread.currentThread()
                            .getName() + "获得a,想要获得b");
                        synchronized ("b") {
                            System.out.println(Thread.currentThread()
                                .getName() + "获得a,也获得b");
                        }
                    }
                }
                if ("b".equals(Thread.currentThread()
                    .getName())) {
                    synchronized ("b") {
                        System.out.println(Thread.currentThread()
                            .getName() + "获得b,想要获得a");
                        synchronized ("a") {
                            System.out.println(Thread.currentThread()
                                .getName() + "获得b,也获得a");
                        }
                    }
                }
            }
        });
        t1.setName("a");
        t1.start();
        t2.setName("b");
        t2.start();

    }

    static class bbb extends Thread {
        @Override
        public void run() {

            if ("a".equals(Thread.currentThread()
                .getName())) {
                synchronized ("a") {
                    System.out.println(Thread.currentThread()
                        .getName() + "获得a,想要获得b");
                    synchronized ("b") {
                        System.out.println(Thread.currentThread()
                            .getName() + "获得a,也获得b");
                    }
                }
            }
            if ("b".equals(Thread.currentThread()
                .getName())) {
                synchronized ("b") {
                    System.out.println(Thread.currentThread()
                        .getName() + "获得b,想要获得a");
                    synchronized ("a") {
                        System.out.println(Thread.currentThread()
                            .getName() + "获得b,也获得a");
                    }
                }
            }
        }
    }
}
