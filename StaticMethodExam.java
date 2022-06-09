public class StaticMethodExam {
    public static void main(String[] args){
        Student1 = kim new Student1()                                                   ;
        Student1 = jang new Student1()                                                  ;
        Student1 = bak new Student1()                                                   ;
        System.out.println("생성된 학생 객체 수는 "+ Student1.getCount() + "입니다.")       ;
    }
}
                                                                                            
class Student1{
    String name;
    int grade;
    static int count = 0;
    public Student1() {count++;}
    public static int getCount() {return count;}

}
