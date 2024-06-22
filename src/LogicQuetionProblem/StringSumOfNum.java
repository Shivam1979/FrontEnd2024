package LogicQuetionProblem;
/*12. *Sum of the Numbers in a String* 🔢
        - *Input:* String = "abc123xyz456"
        - *Output:* Sum = 579*/
public class   StringSumOfNum {
    public static void main(String[] args) {
       String str = "abc123xyz456";
        System.out.println(SumOfNum(str));
    }
    public static int SumOfNum(String str) {
        String tempSum = "0";
        int sum =0;
        for (int i = 0; i <str.length(); i++) {
            char s = str.charAt(i);
            if (Character.isDigit(s)){
                tempSum = tempSum +s;
            }else {
                sum  = sum +Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }
        return sum + Integer.parseInt(tempSum);
    }
}
