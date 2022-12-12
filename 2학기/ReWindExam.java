public class ReWindExam {
    public static void main(String[] args) {
        String str1 = new String("Re:Wind");
        String str2 = new String("Re:Wind");

        // 비교 연산자: 메모리 상에서 같은 녀석일까?
        if(str1 == str2) System.out.println("같은 녀석임");
        else System.out.println("같은 녀석이 아닌 도플갱어");

        // String.equals(): 문자열의 내용이 같은가?
        if(str1.equals(str2)) System.out.println("내용이 같음");
        else System.out.println("내용이 같지 않음");
    }
}