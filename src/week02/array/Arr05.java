package week02.array;

import java.util.Arrays;

public class Arr05 {
    public static void main(String[] args) {
        String str = "ABCD";

        int length = str.length();
        System.out.println(length);

        char strChar = str.charAt(1);
        System.out.println(strChar);

        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        char[] strCharArray = str.toCharArray();

        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println("charArrayString = " + charArrayString);
    }
}
