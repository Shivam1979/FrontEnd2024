package LogicQuetionProblem;
/*2. *A Sum of Digits of a Number* ➕
        - *Input:* Number = 456
        - *Output:* Sum = 15*/
public class SumOfDigit {
    public static void main(String[] args) {
        int number = 456;
        int n = 0;
        while(number>0){
            int b =  number %10;
            n = n + b;
            number /=10;
        }
        System.out.println(n);
    }
}
