
public class scopeTest {
    enum Gender{
        MALE, FEMALE;
    }

    Gender gender1;
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeT(int value) {
        int localScope = 20;
    }

    public static void main(String[] args) {
        System.out.println(staticVal);
    }
}