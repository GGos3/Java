public class Caesar {
    public static String encrypt(String msg, int key){
        StringBuffer result = new StringBuffer(); // 암호문을 저장할 StringBuffer 객체
        for(int i=0; i<msg.length(); i++){
            char nChr; // 암호화한 문자를 저장할 변수
            if(msg.charAt(i) == ' ') {
                result.append(' ');
                continue;
            }
            nChr = (char) ((msg.charAt(i)+key-'a')%26 +'A');
            result.append(nChr);

            System.out.println( i + "번째 문자 암호화: " + msg.charAt(i) + " => " + nChr);
        }
        return result.toString();   // 암호문을 String 객체로 변환하여 반환한다
    }

    public static String decrypt(String msg, int key){
        StringBuffer result = new StringBuffer(); // 암호문을 저장할 StringBuffer 객체
        for(int i=0; i<msg.length(); i++){
            char nChr; // 암호화한 문자를 저장할 변수
            if(msg.charAt(i) == ' ') {
                result.append(' ');
                continue;
            }
            nChr = (char) ((msg.charAt(i)-key-'a')%26 +'A');
            result.append(nChr);

            System.out.println( i + "번째 문자 복호화: " + msg.charAt(i) + " => " + nChr);
        }
        return result.toString();   // 암호문을 String 객체로 변환하여 반환한다
    }
}

