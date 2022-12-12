import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        fos.write(259);
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        int data = fis.read();

        System.out.println(data);
    }
}
