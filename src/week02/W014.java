package week02;

import java.util.Objects;
import java.util.Scanner;

public class W014 {
    public static void main(String[] args) {
        int month = 8;
        String mothString = "";

        switch(month) {
            case 1 -> mothString = "January";
            case 2 -> mothString = "February";
            case 3 -> mothString = "March";
            case 4 -> mothString = "April";
            case 5 -> mothString = "May";
            case 6 -> mothString = "June";
            case 7 -> mothString = "July";
            case 8 -> mothString = "August";
            case 9 -> mothString = "September";
            case 10 -> mothString = "October";
            case 11 -> mothString = "November";
            case 12 -> mothString = "December";
            default -> mothString = "알수없음";
        }

        System.out.println("mothString = " + mothString);
    }
}
