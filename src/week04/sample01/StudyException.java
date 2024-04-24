package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        try {
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
            System.out.println("Caught OurBadException");
        }
    }
}
