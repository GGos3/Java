public class constExam {
    public static void main(String[] args){
        Student kim = new Student();
        Student jang = new Student("장민재");
        System.out.println("이름 : " + kim.name);
        System.out.println("이름 : "+ jang.name);

    }
}
class Student{
    String name;
    int grade;
    int ban;
    int number;
    String telephone;
    public Student() {}
    public Student(String n) {name = n;}

    public Student(String n, int g) {
        name = name; grade = grade;
    }

}
