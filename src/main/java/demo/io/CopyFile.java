package demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
    public static void main(String[] args) {
        String src = "C:/Users/Administrator/Pictures/20180202135334633.jpg";
        File file = new File(src);
        String desc = "D:/IOTest";
        File file2 = new File(desc + "/" + file.getName());
        long start = System.currentTimeMillis();
        copy(src, file2);
        long end = System.currentTimeMillis();
        System.out.println("cost:" + (end - start) / 1000.00);
    }

    private static void copy(String src, File file2) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(file2);
            byte[] bytes = new byte[8196];
            int cc = in.read(bytes);
            while (cc != -1) {
                out.write(bytes, 0, cc);
                cc = in.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
