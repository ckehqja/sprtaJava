package week02.array;

import java.util.Arrays;

public class Arr07 {
    public static void main(String[] args) {
        int[][] array = new int[3][];

        array[0] = new int[2];
        array[0] = new int[4];
        array[0] = new int[1];

        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };

        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ,");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2));
    }
}
