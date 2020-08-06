package demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author admin
 * @since 2.1.0 2020/7/16 1:01
 */
public class RunTimeTest {
    public static void main(String[] args) {
        Process p;
        String cmd = "ipconfig";
        // try {
        //     p = Runtime.getRuntime()
        //         .exec(cmd);
        //     InputStream fis = p.getInputStream();
        //     InputStreamReader isr = new InputStreamReader(fis);
        //     BufferedReader br = new BufferedReader(isr);
        //     String line = null;
        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        long l = Runtime.getRuntime()
            .freeMemory();
        System.out.println(l);
    }
}
