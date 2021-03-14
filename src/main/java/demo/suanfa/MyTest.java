package demo.suanfa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyTest {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int i = sc.nextInt();
        MyTest test = new MyTest();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> test.insert(Thread.currentThread())).start();
            new Thread(() -> test.insert(Thread.currentThread())).start();
        }

    }

    private void insert(Thread thread) {
        lock.readLock().lock();
        try {
            long start = System.currentTimeMillis();

            while(System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName()+"正在进行读操作");
            }
            System.out.println(thread.getName()+"读操作完毕");
        } finally {
            System.out.println(thread.getName() + "释放锁");
            lock.readLock().unlock();
        }

    }
}
