public class FishExam {
    public static void main(String[] args) {
        String str1 = new String ("단팥 붕어빵");
        String str2 = new String ("단팥 붕어빵");
        String str3 = new String ("슈크림 붕어빵");

        // 비교 연산자: 같은 붕어빵인가요?
        if(str1 == str2) System.out.println("1, 2번은 같은 붕어빵");
        else System.out.println("1, 2번은 다른 붕어빵");

        // 비교 연산자: 같은 붕어빵인가요?
        if(str1 == str3) System.out.println("1, 3번은 같은 붕어빵");
        else System.out.println("1, 3번은 다른 붕어빵");

        if(str1.toString() == str2.toString()) System.out.println("1, 2번은 내용물이 같은 붕어빵");
        else System.out.println("1, 2번은 내용물이 다른 붕어빵");

        if(str1.equals(str2)) System.out.println("1, 2번은 내용물이 같은 붕어빵");
        else System.out.println("1, 2번은 내용물이 다른 붕어빵");
    }
}