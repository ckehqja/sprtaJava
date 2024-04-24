package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("before car.gear = " + car.gear);

        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);
        System.out.println();

        System.out.println("after car.gear = " + car.gear);
        System.out.println();

        car.carSpeeds(100, 70);
        System.out.println();

        car.carSpeeds(100, 80, 154);
        System.out.println();
    }
}
