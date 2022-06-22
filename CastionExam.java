public class CastionExam {
    public static void main(String[] args){
        Car mycar, yousrCar;
        Bus mybus, yourBus;
        Truck mytruck, yourtruck;
        mycar = new Car();
        mybus = new Bus();
        mytruck = new Truck();
        System.out.println("[" + mycar.print() + "]");
        System.out.println("[" + mybus.print() + "]");
        System.out.println("[" + mytruck.print() + "]");
        yousrCar = mybus;
        yourBus = (Bus)yousrCar;
        System.out.println("[" + yousrCar.print() + "]");
        yousrCar = mytruck;
        yourtruck = (Truck)yousrCar;
        System.out.println("[" + yousrCar.print() + "]");
        
    }
}
class Car{
    String name = "차";
    String print(){
        return "[나는 " + name + "이다.]";
    }
}
class Bus extends Car{
    String name = "트럭";
    String print(){
        return "[차의 종류는 " + name + " 이다.]";
    }
}
class Truck extends Car{
    String name;
    String print(){
        return "[차의 종류는 " + name  + " 이다.]";
    }
}