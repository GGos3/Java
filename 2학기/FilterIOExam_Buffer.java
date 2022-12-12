import java.io.*;

public class FilterIOExam_Buffer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream fOut = new DataOutputStream(fos);
        fOut.writeInt(740);
        fOut.writeDouble(3.14159265358979);
//      bos.flush();
//      fOut.close();
//      bos.close();
//      fos.close();
        fOut.flush();
        bos.flush();
        fos.flush();

        FileInputStream fis = new FileInputStream("data.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream fIn = new DataInputStream(fis);
        int data = fIn.readInt();
        double p = fIn.readDouble();

        fIn.close();
        bis.close();
        fis.close();

        System.out.println(data);
        System.out.println(p);
    }
}
