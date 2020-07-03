package demo;

import java.util.Scanner;

public class JinZiTa {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("����n:");
        //�½�������
        Scanner scanner = new Scanner(System.in);
        //������
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {//i����
            for (int j = n - i - 1; j > 0; j--) {//�ո�
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {//*
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
/**
 * ----*
 * ---***
 * --*****
 * -*******
 */