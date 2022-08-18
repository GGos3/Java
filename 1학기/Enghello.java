public class Enghello extends Greeting {
    public String name = "Mr.hong";
        public void sayHello(){
            System.out.println(name + "Nice to meet you");
        }
        public void test(){
            System.out.println(super.name);
            super.sayHello();
        }
    public static void main(String[] args){
        Enghello eng = new Enghello();
        eng.sayHello();
        eng.test();
    }
}
class Greeting{
    public void sayHello(){
        public String name;
        System.out.print("씨 안녕하세요");
    }
}