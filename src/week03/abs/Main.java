package week03.abs;

public class Main {
    public static void main(String[] args) {
        AudiCar audiCar = new AudiCar();
        BenzCar benzCar = new BenzCar();
        ZenesisCar zenesisCar = new ZenesisCar();

        audiCar.horn();
        benzCar.horn();
        zenesisCar.horn();

        audiCar.gasPedal(100);
    }
}
