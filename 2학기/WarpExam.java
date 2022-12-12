public class WarpExam {
    public static void main(String[] args) {
        int i = 365; // 1년은 365일
        double d = 36.5; // 사람의 체온은 36.5
        Integer wint = 2022; // 올해는 2022년
        Double PI = 3.141592;

        String id = Double.toString(i + d);

        System.out.println("int" + i);
        System.out.println("double " + d);
        System.out.println("id " + id);
        System.out.println("Wrapped Integer " + wint.toString());
        System.out.println("wrapped Double " + wint.toString());
    }
}
