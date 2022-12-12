// 문제: System.in이 아닌 large_in.txt에서 입력받도록 수정해보세요
import java.io.*;

public class InputFileReaderExam {
    public static void main(String[] args) throws IOException{
        try
        {
            FileInputStream fis = new FileInputStream("in.txt");
            Reader reader = new InputStreamReader(fis);

            while(true){
                int i = reader.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
            reader.close();
            fis.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}