package LogicQuetionProblem;


/*14. *Remove All Characters from String Except Alphabets* 🆑
        - *Input:* String = "Hello123@World456"
        - *Output:* "HelloWorld"*/

public class removeAllCharExceptAlphabet {

    public static void main(String[] args) {
        String str = "123s1h2i3v@am4s5i6n-g=h*&^%$#";
        System.out.println(RemoveAllChar(str));
    }
    public static String RemoveAllChar(String str){
        String str1 = "";
        for (int i = 0; i <str.length() ; i++){
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)){
                str1 += ch;
            }
        }
        return str1;
    }
}
