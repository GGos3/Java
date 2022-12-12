import java.io.FileReader;

public class IOExcept {
    public static void main(String[] args) {
        char[] buffer = new char[100];
        try{
            FileReader fr = new FileReader("in.txt");
            fr.read(buffer, 0, 100);
            fr.close();

            String str = new String(buffer);
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
