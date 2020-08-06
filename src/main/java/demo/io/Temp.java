package demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author admin
 * @since 2.1.0 2020/7/15 18:09
 */
public class Temp {
    private static Temp instant = null;

    private Temp() {
    }

    public static void main(String[] args) throws Exception {
        String src = "D:\\temp";
        String desc = "D:\\desc";
        // m1(src,desc);
        System.out.println(getInstance());

    }

    private static Temp getInstance() {
        if (instant == null) {
            synchronized (Temp.class) {
                if (instant == null) {
                    instant = new Temp();
                }
            }

        }
        return null;
    }

    private static void m1(String src, String desc) throws Exception {
        File descF = new File(desc);
        if (!descF.exists()) {
            descF.mkdir();
        }

        File srcF = new File(src);
        File[] files = srcF.listFiles();
        for (File file : files) {
            File descSubF = new File(desc, file.getName());
            if (file.isDirectory()) {
                descSubF.mkdir();
                m1(file.getAbsolutePath(), descSubF.getAbsolutePath());
            }
            if (file.isFile()) {
                copyFile(file, descSubF);
            }
        }

    }

    private static void copyFile(File src, File desc) throws Exception {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        byte[] b = new byte[1024];
        int len = fis.read(b);
        while (len != -1) {
            fos.write(b, 0, len);
            len = fis.read(b);
        }
        fis.close();
        fos.close();
    }
}
