public class constExam2 {
    public constExam2(){
        System.out.println("public");
    }
    protected constExam2(int a) {
        System.out.println("protected");
    }
    constExam2(int a, int b){
        System.out.println("default");
    }
    private constExam2(int a, int b,int c) {
        System.out.println("private");
    }
    public static void main(String[] args){
        constExam2 e = new constExam2();
        constExam2 ee = new constExam2(1);
        constExam2 eee = new constExam2(1, 2);
        constExam2 eeee = new constExam2(1, 2, 3);
        constExam2 eeeeee = new constExam2(3, 5);

    }   
}
