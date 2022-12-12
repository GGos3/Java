import java.util.Scanner;

public class CaesarEncode {
    public static void main(String[] args) {
        int key;
        String msg, ciperText;
        Scanner sc = new Scanner(System.in);

        System.out.print("평문: ");
        msg = sc.nextLine();

        System.out.print("Key: ");
        key = Integer.parseInt(sc.nextLine());

        ciperText = Caesar.encrypt(msg.toLowerCase(),key);

        System.out.println("암호화:" + ciperText);
    }
}