package LogicQuetionProblem;
/*
13. *Change the Case of Each Character in a String* 🔡
        - *Input:* String = "HelloWorld"
        - *Output:* "hELLOwORLD"*/

public class ChangeLetterCase {
    public static void main(String[] args) {
        String str = "HelloWorld";
    String s = ChangeCase(str);
    }
    public static String ChangeCase(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isUpperCase(character)) {
                newString += Character.toLowerCase(character);
            } else {
                newString += Character.toUpperCase(character);
            }
        }
        System.out.println(newString);
    return "";
    }
}
