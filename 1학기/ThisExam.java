public class ThisExam {
    public static void main(String[] args){
        Student kim = new Student();
        Student jang = new Student("장민재");
        Student min = new Student("민서진", 3);
        System.out.println("이름 : " + kim.name);
        System.out.println("이름 : " + jang.name);
        System.out.println("이름 : " + min.name + "반 : " + min.grade);
    }
}
class Student{
    String name;
    int grade;
    int ban;
    int number;
    String telephone;
    public Student() {}
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int grade) {
        //this.name = name;
        this(name);
        this.grade = grade;
    }

}
