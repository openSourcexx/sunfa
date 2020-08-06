package demo.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import demo.suanfa.HeapSort;

/**
 * @author admin
 * @since 2.1.0 2020/7/21 19:41
 */
public class FileUtil {
    private static String targetF = "D:/write.txt";
    private static String tempDir = "d:/temp";
    private static int subSize = 100;

    public static void main(String[] args) {
        // write();
        // for (int i = 0; i < 100; i++) {
        //     System.out.println(ramdom());
        // }
        // spiltFile();
        sortFile(tempDir);
    }

    private void read(String path, String tab) {
        File src = new File(path);
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(tab + file.getName());
            }
            if (file.isDirectory()) {
                System.out.println(file.getName());
                read(file.getPath(), tab + "\t");
            }
        }
    }

    private static void sortFile(String tempDir) {
        File f = new File(tempDir);
        File[] files = f.listFiles();
        List<Integer> list = new ArrayList<>();
        FileInputStream fi = null;
        for (File file : files) {
            // 解析排序
            try {
                fi = new FileInputStream(file);
                Scanner scanner = new Scanner(fi);
                while (scanner.hasNext()) {
                    list.add(Integer.parseInt(scanner.nextLine()));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (fi != null) {
                    try {
                        fi.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            // 对文件内容堆排序
            int[] sorts = HeapSort.heapSort(list);
            list.clear();
            // 将排序数据重新写入文件
            rewriteData(file, sorts);
        }
    }

    private static void rewriteData(File file, int[] data) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            for (int i = 0; i < data.length; i++) {
                fw.write(data[i] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void spiltFile() {
        String path = targetF;
        FileInputStream fi = null;
        FileOutputStream fos = null;
        try {
            fi = new FileInputStream(path);
            Scanner sc = new Scanner(fi, "UTF-8");
            Integer line = 0;
            int create = 0;

            while (sc.hasNext()) {
                String str = sc.nextLine() + "\n";
                if (line % subSize == 0) {
                    line = 0;
                    create++;
                    File f = createSubFile(tempDir + "/" + create);
                    fos = new FileOutputStream(f);
                }
                fos.write(str.getBytes());
                line++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fi.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // System.out.println(fi);
    }

    private static File createSubFile(String subPath) {
        File f = new File(subPath + ".txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return f;
    }

    private static void write() {
        String path = "D:/write.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            for (int i = 0; i < 1000; i++) {
                bw.write(ramdom() + "");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int ramdom() {
        Random r = new Random();
        return r.nextInt(100000);
    }
}
