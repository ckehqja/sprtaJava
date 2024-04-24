package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        /*Stack
         * 수직으로 값을쌓아놓고 넣었다가 뺀다. FILO(Basket)
         * push, peek, pop
         * 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용*/
        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10);
        intStack.push(19);
        intStack.push(1);

        while (!intStack.isEmpty()) System.out.println(intStack.pop());

        intStack.push(10);
        intStack.push(19);
        intStack.push(1);
        intStack.push(21);

        for (Integer i : intStack) {
            System.out.println(i);
        }

        System.out.println("intStack.peek() = " + intStack.peek());
        System.out.println("intStack.peek() = " + intStack.peek());
        System.out.println("intStack.size() = " + intStack.size());
    }
}
