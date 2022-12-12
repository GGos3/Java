public class TrimExam {
    public static void main(String[] args) {
        String str = " This is Test    ";
        String str2 = "hi hello";

        System.out.print(str);
        System.out.println("End");

        System.out.print(str.trim());
        System.out.println(" END");

        System.out.println(str2.substring(3));
        System.out.println(str2.substring(0, 2));
    }
}
