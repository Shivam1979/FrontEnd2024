package LogicQuetionProblem;
/*
10. *Remove Spaces from a String* ➖
        - *Input:* String = "Hello World"
        - *Output:* "HelloWorld"*/
public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Hello how are you";
        RemoveSpace r = new RemoveSpace();
        System.out.println(r.RemoveSpaceFromString(str));
    }
    public String RemoveSpaceFromString(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) != ' ') {
                str1 += str.charAt(i);
            }
        }
        return str1;
    }
}
