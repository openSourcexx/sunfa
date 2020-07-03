package demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFile {

    public static void main(String[] args) {
        File file = new File("G:/java程序/workspace/Test/src/zhujie/JDBCUtil.java");
        Reader in = null;
        BufferedReader br = null;
        try {
            in = new FileReader(file);
            br = new BufferedReader(in);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
