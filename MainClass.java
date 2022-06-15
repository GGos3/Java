public class MainClass {
    public static void main(String[] args){
        Leader hong = new Leader("홍길동", "30130", true);
        hong.isLeader();

    }
}
class Student_1{
    String name;
    String hakbun;
    String phone;
    String juso;
    String major;
    public Student_1(){}
    public Student_1(String name, String hakbun) {
        this.name = name;
        this.hakbun = hakbun;
    }
    public void study() {System.out.println("공부중");}
    public void eat(){System.out.println("먹는중");}
    public void test(){System.out.println("시험중");}
    public void extra_act (){System.out.println("동아리중");}
}
class Leader extends Student_1{
    boolean leader;
    public Leader(){}
    public Leader(String name, String hakbun, boolean bleader){
        super(name, hakbun);
        leader = bleader;
    }
    public void isLeader(){
        if (leader)
            System.out.println("학급 회장입니다.");
        else
            System.out.println("학급 회장이 아닙니다.");
    }
    public void greet() {
        System.out.println("인사하다.");
    }
}