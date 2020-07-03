package demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {

        String src = "d:/20180202135334633.jpg";
        String desc = "H60-L01\\SD 卡\\视频";
        long start = System.currentTimeMillis();
        copy(src, desc);
        long end = System.currentTimeMillis();
        System.out.println("cost:" + (end - start) / 1000.00);
    }

    private static void copy(String src, String desc) {
        File file = new File(src);
        File descFile = new File(desc + "/" + file.getName());
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(descFile);
            byte[] bytes = new byte[8196];
            int cc = fis.read(bytes);
            while (cc != -1) {
                fos.write(bytes, 0, cc);
                cc = fis.read(bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
