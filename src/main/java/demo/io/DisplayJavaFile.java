package demo.io;

import java.io.File;

/**
 * 递归实现列出当前工程下所有.java文件
 *
 * @author Administrator
 */
public class DisplayJavaFile {

    public static void main(String[] args) {
        String path = "G:/java程序/workspace/Test";
        //		String path = "G:/aa";
        File file = new File(path);
        if (file.exists()) {
            getFile(file);
        } else {
            System.out.println("不存在该文件" + path);
        }
    }

    private static void getFile(File file) {
        if (file.isFile()) {
            String fileName = file.getName();
            if (fileName.contains(".")) {
                String suffix = fileName.substring(fileName.lastIndexOf("."));
                if (".java".equals(suffix)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        } else {
            File[] files = file.listFiles();
            for (File file2 : files) {
                getFile(file2);
            }
        }
    }
}
