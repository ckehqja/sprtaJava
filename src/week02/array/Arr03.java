package week02.array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = a;

//        b[0] = 3;
//        System.out.println(a[0]);

        b = a.clone();
        b[0]=3;
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}