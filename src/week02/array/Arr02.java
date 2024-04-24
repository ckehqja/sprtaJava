package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        for (int i : intArr) {
            System.out.print(i + ", ");
        }

        System.out.println();
        Arrays.fill(intArr, 9);
        System.out.println(Arrays.toString(intArr));
    }
}
