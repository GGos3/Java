public class MainTruckExam {
    public static void main(String[] args){
        Truck1 mytruck = new Truck1();
        mytruck.speedUp();
        mytruck.speedDown();
        
    }
}
class Car1{
    String carname;
    String color;
    int vel;
    void speedUp() {
        vel += 5 ;
        System.out.println("속도 " + vel + " 증가");
        
    }
    void speedDown(){
        vel -= 5;
        System.out.println("속도 " + vel + " 감소");
        
    }

}
class Truck1 extends Car1{
    int ton = 5;
    void speedUp() {
        vel += 10;
        System.out.println("속도 " + vel + " 증가");
    }
}