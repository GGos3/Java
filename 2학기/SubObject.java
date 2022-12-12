public class SubObject extends SuperObject {
    public SubObject(String name){
        super(name);
    }
    public void draw() {
        System.out.println("그림쟁이");
    }

    public static void main(String[] args) {
        SubObject obj = new SubObject("예이");
        System.out.println(obj.name);
        obj.paint();
        System.out.println(obj);
    }
}
