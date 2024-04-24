package week02.collection;

import java.util.LinkedList;

public class Col4 {
    public static void main(String[] args) {
        /*Queue : FIFO
        * add , peek, poll
        * Queue: 생성자가 없는 인터페이스 */
        var intQueue = new LinkedList<>();

        intQueue.add(1);
        intQueue.add(4);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println("intQueue.poll() = " + intQueue.poll());
        }

        intQueue.add(1);
        intQueue.add(4);
        intQueue.add(9);
        intQueue.add(92);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("intQueue.peek() = " + intQueue.peek());
        System.out.println("intQueue.size() = " + intQueue.size());
    }
}
