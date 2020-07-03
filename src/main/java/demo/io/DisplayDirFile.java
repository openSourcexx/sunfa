package demo.io;

import java.io.File;
import java.util.Scanner;

/**
 * 递归实现输入任意目录，列出文件以及文件夹
 *
 * @author Administrator
 */
public class DisplayDirFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入文件夹路径:");
        String path = sc.next();
        File file = new File(path);
        if (file.exists()) {
            display(file);
        } else {
            System.out.println("不存在该文件" + path);
        }
    }

    private static void display(File file) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath());
        } else {
            String dirPath = file.getAbsolutePath();
            System.out.println(dirPath);
            File[] files = file.listFiles();
            for (File file2 : files) {
                display(file2);
            }
        }
    }
}
