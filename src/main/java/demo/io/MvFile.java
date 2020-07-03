package demo.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
 * 录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件
 *
 * @author Administrator
 */
public class MvFile {
    public static void main(String[] args) throws IOException {
        //m1();

    }

    private static void m1() throws IOException, FileNotFoundException {
        String fileName = "d:/HelloWorld.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            Writer out = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(out);
            bw.write("asdas");
            bw.newLine();
            bw.write("asd啊实打实");
            bw.close();
        }
        String dir = "d:/IOTest";
        byte[] arr = new byte[8196];
        FileInputStream fi = new FileInputStream(file);
        File file2 = new File(dir + "/" + file.getName());
        FileOutputStream fos = new FileOutputStream(file2);
        int cc = fi.read(arr);
        while (cc != -1) {
            fos.write(arr, 0, cc);
            cc = fi.read(arr);
        }
        fi.close();
        fos.close();
        file.delete();

        display(new File(dir));
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
