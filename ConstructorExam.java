public class ConstructorExam {
    public static void main(String[] args) {
        Student kim = new Student();
        Student jang = new Student();
        System.out.println("학생의 이름은" + kim.name);
        System.out.println("학생의 이름은" + jang.name);
    }
}
class Student{
    String name;
    int grade;
    int ban;
    int number;
    String telephone;
    public Student() {} 
    public Student(String n){name = n;}
}