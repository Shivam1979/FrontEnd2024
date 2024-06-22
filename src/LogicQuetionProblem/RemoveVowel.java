package LogicQuetionProblem;
/*11. *Remove Vowels from the String* 🚫
        - *Input:* String = "Hello"
        - *Output:* "Hll"*/
public class RemoveVowel {
    public String RemVowel(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                str1 += ch;
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        String str = "Hello";
        RemoveVowel r = new RemoveVowel();
        System.out.println(r.RemVowel(str));
    }
}
