package week03;

public class Car {

    //고유 데이터 영역
    String company;
    String model = "GV80";
    String color;
    double price;

    // 상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true;

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    //생성자 : 청므 객체가 생성될 때 어떤 로직을 수행해야 하며 ,여떤 값이 필수로 들어와야 하는지 정의
    public Car() {
        //기본 생성자 생략가능
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double breakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear ( char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵~~~~!!");
    }

    //자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
