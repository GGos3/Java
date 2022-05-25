public class StaticTest01 {
    static int num;
    int count;
    public static void main(String args[]){
        StaticTest01 st1 = new StaticTest01();
        st1.count = 1;
        num = 1;

        System.out.println("객체생성 count : " + st1.count);
        System.out.println("static num : " + num);
    }
}
