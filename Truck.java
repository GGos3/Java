public class Truck extends Car {
    Truck(){    // # 2
        super("SM3");   // 하위 클래스에서 상위 클래스로 갈때 사용
        System.out.println("Truck 생성자"); // 2 실행 순서
    }
    public static void main(String[] args){
        Truck mytruck = new Truck();    // # 1 호출 순서
    }
}
class Car{
    Car(String name){  // # 3
        System.out.println("Car 생성자");   // 1
    }
}