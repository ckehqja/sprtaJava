package week02.collection;

import java.util.HashSet;
import java.util.LinkedList;

public class Col5 {
    public static void main(String[] args) {
        /*집합: 순서 없고, 중복 없음!!
        * 순서가 보장되지 않는 대신 중복을 허ㅗ용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        * Set ->  그냥 쓸 수도 있음, 그러나, HahSet, TreeSet 등으로 응용해서 같이 사용ㅎ 가능
        * Set 은 생성자가 없는 껍데기라것 바로 생성할 수 어ㅗㅄ음*/
        HashSet<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value : intSet) {
            System.out.println(value);
        }

        System.out.println("intSet.contains(2) = " + intSet.contains(2));
        System.out.println("intSet.contains(5) = " + intSet.contains(5));

    }
}
