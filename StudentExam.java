public class StudentExam {
    public static void main(String[] args){
        St kim = new St("김현우"); kim.grade = 2;
        St jang = new St("장민재");
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
    public void print(){
        System.out.println("학생의 이름은 " + this.name + "이고 학년은 " + this.grade + "입니다.");
    }
}