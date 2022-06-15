public class Truck extends Car {
    Truck(){
        System.out.println("Truck 생성자");
    }
    public static void main(String[] args){
        Truck mytruck = new Truck();
    }
}
class Car{
    Car(){
        System.out.println("Car 생성자");
    }
}