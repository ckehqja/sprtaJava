package week05.thread;

public class Main {
    public static void main(String[] args) {
//        new TestThread().start();
//        new TestRunnable().run();
//        String s = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
//        System.out.println(s.length());
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                ;
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 항 : " + sum);
        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
