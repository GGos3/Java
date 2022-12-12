public class ArrayindexOutOfBoundsException {
    public static void main(String[] args) {
        String[] gamers = new String[]{"후부키", "미오", "오카유", "코로네", "스바루"};

        try {
            for(int i = 0; i < 6; i ++)
                System.out.println(gamers[i]);
        }catch (Exception e){
            System.err.println(e.toString());
        }

    }
}
