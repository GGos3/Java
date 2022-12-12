public class MathEx {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.sqrt(9.0));
        System.out.println("e^4: " + Math.exp(4));
        System.out.println(Math.round(3.14));

        // 로또 번호 추첨기: 중복 번호가 나오는데..?? 해결해보자!
        System.out.print("이번 주 행운의 번호는 ");
        int[] lotto = new int[5];

        for (int i = 0; i < 5; i++) {
            // i 번째에 랜덤 번호를 넣어줌
            lotto[i] = (int) (Math.random() * 45 + 1);

            // 중복을 체크하고, 중복이면 i번째 번호를 재추첨
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
            System.out.print(lotto[i] + " ");
        }
    }
}
