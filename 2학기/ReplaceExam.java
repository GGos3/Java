public class ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("today is rainy");
        StringBuffer sb2 = null;
        sb2 = sb1.replace(9, 15, "sunny"); // today is sunny가 출력되게 바꿔보세요!

        System.out.println("sb2 = " + sb2);
        // 우리는 분명 sb2에 replace된 결과(반환값)을 넣은 것 같다... 그런데....?

        System.out.println("sb1 = " + sb1); // ????
    }
}