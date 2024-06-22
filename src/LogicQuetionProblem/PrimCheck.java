package LogicQuetionProblem;
/*
3. *Check if a Number is Prime or Not* 🔢
        - *Input:* Number = 13
        - *Output:* Prime
*/
// the number which is divible by 1 and itself
public class PrimCheck {
    public static boolean prime(int num){
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                flag = false;
                break;}}
        return flag;}
    public static void main(String[] args) {
        int num = 12;
        boolean b = prime(num);
        if (b){
            System.out.println("PRIME");
        }else System.out.println("NOT PRIME");
    }
}

