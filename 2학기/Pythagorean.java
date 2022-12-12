import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 점의 X 좌표를 입력하세요 >> ");
        int x1 = Integer.parseInt(sc.nextLine());
        System.out.print("첫번째 점의 Y 좌표를 입력하세요 >> ");
        int y1 = Integer.parseInt(sc.nextLine());
        System.out.print("두번째 점의 X 좌표를 입력하세요 >> ");
        int x2 = Integer.parseInt(sc.nextLine());
        System.out.print("두번째 점의 Y 좌표를 입력하세요 >> ");
        int y2 = Integer.parseInt(sc.nextLine());

        System.out.println("두 점 사이의 거리는 " + Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) + "입니다.");
    }
}