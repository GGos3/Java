public class SuperObject {
    protected String name;
    public SuperObject(String name) {
        this.name = name;
    }
    public void draw(){
        System.out.println("Super Object");
    }
    public  void paint(){
        draw();
    }
}
