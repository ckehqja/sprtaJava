import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            String aa = sc.next();
            int a;
            if(aa.equals("q")) {break;}
            else { a = Integer.parseInt(aa);}
            String operator = sc.next();
            int b = sc.nextInt();
            int result = Calculation.calculate(a, operator, b);
            System.out.println("result = " + result);
        }
    }
}