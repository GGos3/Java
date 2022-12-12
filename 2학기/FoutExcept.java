import java.io.FileWriter;
import java.io.IOException;

public class FoutExcept {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("outdput.txt");
            fw.write("Test Text");
            fw.close();
        }catch (IOException e){
            System.err.println("IOException 발생");
            e.printStackTrace();
        }finally {
            System.out.println("예외 여부와 관계 없이 무조건 실행되는 finally 구문");
        }
        System.out.println("FOutExcept.java 실행 완료");
    }
}
