public class StudentExam {
    public static void main(String[] args){
        //St kim = new St("김현우"); kim.grade = 2;
        //St jang = new St("장민재", 3);
        //kim.print(); jang.print();
        St kim = new St("김현우");
        kim.setGrade(2);
        St jang = new St("장민재", 3);
        System.out.println("학생의 이름은 " + kim.getName() + "이고, " + kim.setGrade() + "학년 입니다.");
        System.out.println("학생의 이름은 " + jang.getName() + "이고, " + jang.setGrade() + "학년 입니다.");
    }
}
class St{
    String name;
    int grade;
    public St() {}
    public St(String name) {this.name = name;}
    public St(String name, int grade) {
        this(name);
        this.grade = grade;
    }
    public void print() {
        System.out.println("학생의 이름은 " + this.name + "이고 학년은 " + this.grade + "입니다.");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setGrade (int grade){
        this.grade = grade;
    }
    public int setGrade() {
        return this.grade;
    }
}