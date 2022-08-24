public class Hello {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++){
            for (int j = 0; j < 500 ; j++) {
                if (j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
