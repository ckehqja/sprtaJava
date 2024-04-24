package week02;

import java.util.Scanner;

public class W017 {
    public static void main(String[] args) {

        System.out.println("단수를 입력하세요 >");
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        System.out.println("Multiplication table for " + dan + " is:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

    }
}