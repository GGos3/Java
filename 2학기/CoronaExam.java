public class CoronaExam {
    public static void main(String[] args) {
        double temp = 36.5; //사람의 체온은 36.5도
        Double Temp = temp;
        System.out.println("체온 : " + temp + "도");
        Temp = (Double)getCovid(temp);
        System.out.println("코로나의 걸린 뒤 체온:" + Temp.doubleValue() + "도");
    }

    public static Double getCovid(Object temp){
        return  (Double)temp + 1.7;
    }
}
