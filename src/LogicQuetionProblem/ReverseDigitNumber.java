package LogicQuetionProblem;
/*1. *Reverse Digits of a Number* 🔄
        - *Input:* Number = 12345
        - *Output:* Reversed Number = 54321*/
public class ReverseDigitNumber {
    public static void main(String[] args) {
        int num = 12345;
        int num1=0;
        while (num>0){
            int b = num%10;
            num1 = (num1 *10) + b;
            num = num/10;
        }
        System.out.println(num1);
    }
}
