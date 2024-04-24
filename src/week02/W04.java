package week02;

public class W04 {
    public static void main(String[] args) {
//논리연산자
        //비교 연산의 결과값으로 받을 수 있는   boolean값을 연결하는 연산자
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        //||
        System.out.println("=========================");
        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);

        //&&
        System.out.println("=========================");
        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));

        //or
        System.out.println("=========================");
        System.out.println((5 > 3) || (3 > 1));
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1));

        // 논리 부정 연산자 (! : NOT)
        System.out.println("NOT=========================");
        System.out.println(!flag1);
        System.out.println(!flag3);
        System.out.println(5 == 5);
        System.out.println(5 != 5);
    }
}
