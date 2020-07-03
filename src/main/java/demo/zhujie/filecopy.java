package demo.zhujie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将G:/aa文件夹拷贝到D盘
 *
 * @author Administrator
 */
public class filecopy {

    public static void main(String[] args) {
        copyDir("G:/aa", "d:/aa");
        //		copyFile("G:/gbk.txt","d:/gbkcopy.txt");
    }

    private static void copyFile(File srcFile, File descFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcFile);

            fos = new FileOutputStream(descFile);
            byte[] bytes = new byte[8192];
            int cc = fis.read(bytes);
            while (cc != -1) {
                //				System.out.print((char)cc);
                fos.write(bytes, 0, cc);
                cc = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void copyDir(String srcDir, String descDir) {
        File descFolder = new File(descDir);//目标文件夹
        //如果目标文件夹没有该目录，就创建
        if (!descFolder.exists()) {
            descFolder.mkdirs();
        }
        File srcFolder = new File(srcDir);//源文件夹
        File[] listFiles = srcFolder.listFiles();
        for (File file : listFiles) {
            //是文件,直接复制g:/aa/abc.txt d:/aa/abc.txt
            if (file.isFile()) {
                descFolder = new File(descDir, file.getName());//创建复制的文件d:/aa/a.txt
                copyFile(file, descFolder);
            }
            if (file.isDirectory()) {
                //g:/aa/test/1.txt-->d:/aa/test/1.txt
                String path = file.getAbsolutePath();
                descFolder = new File(descDir, file.getName());
                copyDir(path, descFolder.getAbsolutePath());//getAbsolutePath()将文件转换为字符串，迭代
            }
        }
    }

}
