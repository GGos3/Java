import java.util.Scanner;

public class ParseDataExam {
    public static void main(String[] args) {
        String a, b;
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double average = 0;

        System.out.print("A: ");
        a=scanner.nextLine();
        System.out.print("B: ");
        b=scanner.nextLine();
        System.out.println("input data : " + a + " " + b);

        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);

        sum = c + d;
        average = sum/2;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println("평균 = " + average);
    }
}