package demo;

import java.util.Scanner;

public class AverageTemperatures {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 0;
        double sum, average;
        sum = 0;
        //����һ��Scanner����
        double[] temperature = new double[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("������7����¶ȣ�");
        for (count = 0; count < temperature.length; count++) {
            //ͨ��Scanner�������û�����
            temperature[count] = sc.nextDouble();
            sum += temperature[count];
        }
        System.out.println(sum);
        average = sum / 7;
        System.out.println("ƽ�����£�" + average);
    }

}
