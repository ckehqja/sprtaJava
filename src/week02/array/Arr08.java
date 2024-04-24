package week02.array;

import java.util.Arrays;

public class Arr08 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 1};

        int max = arr[0];
        int min = arr[0];
        for (int i : arr) if (i > max) max = i;
        for (int i : arr) if (i < min) min = i;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
