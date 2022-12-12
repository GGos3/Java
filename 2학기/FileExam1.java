import java.io.FileReader;
import java.io.FileWriter;

public class FileExam1 {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("datar.txt");
            FileWriter fileWriter = new FileWriter("dataw.txt");

            int c;
            while((c = fileReader.read()) != -1){
                fileWriter.write(c);
            }
        }catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.err.println("헉! 에러다");
            System.out.println("난 에러 아닌데 ㅋㅋ");
            System.out.println("난 에러 아닌척 하는 에러" +System.err);
        }
    }
}
