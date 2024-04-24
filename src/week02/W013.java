package week02;

import java.util.Objects;
import java.util.Scanner;

public class W013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A입력: ");
        String aHand = sc.nextLine();
        System.out.println("B입력: ");
        String bHand = sc.nextLine();

        if (aHand.equals(bHand)) {
            System.out.println("무승부");
        } else if (Objects.equals(aHand, "찌")) {
            if (Objects.equals(bHand, "묵")) {
                System.out.println("bHand 승");
            } else {
                System.out.println("aHand 승");
            }
        } else if (Objects.equals(aHand, "묵")) {
            if (Objects.equals(bHand, "빠")) {
                System.out.println("bHand 승");
            } else {
                System.out.println("aHand 승");
            }
        }else  {
            if (Objects.equals(bHand, "찌")) {
                System.out.println("bHand 승");
            } else {
                System.out.println("aHand 승");
            }
        }
    }
}
