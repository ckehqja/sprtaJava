package week05.thread.priority;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.setPriority(8);
        int threadPriority = thread1.getPriority();
        System.out.println("threadPriority = " + threadPriority);

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2);
        int count1 = 0;
        int count2 = 0;
        String s = "**********************************************************$$*************$************$$$$$$*******$$$$**********$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '$') {
                count1++;
            } else if(s.charAt(i) == '*') {
                count2++;
            }
        }
        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
        thread1.start();
        thread2.start();
    }


}