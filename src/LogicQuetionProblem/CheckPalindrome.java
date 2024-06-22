package LogicQuetionProblem;
import java.util.Locale;
public class CheckPalindrome {
    /*9. *Check if a Given String is Palindrome or Not* 🔠
            - *Input:* String = "racecar"
            - *Output:* Palindrome*/
    public static void main(String[] args) {
        String str1 = "Shivammavihs";
        String str = str1.toLowerCase(Locale.of(str1));
        CheckPalindrome c = new CheckPalindrome();
        String s = c.Palindrome(str);
        if (s.equals(str)){
            System.out.println("Palindrome");
        }else System.out.println("Not a palindromme");
    }
    public String Palindrome(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        return temp;
    }
}
