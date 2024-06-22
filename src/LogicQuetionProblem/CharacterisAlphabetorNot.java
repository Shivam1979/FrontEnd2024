package LogicQuetionProblem;

/* 6.*Check Whether a Character is an Alphabet or Not*
        - *Input:* Character = '5'
        - *Output:* Not an Alphabet*/

import java.util.Scanner;
public class CharacterisAlphabetorNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = sc.nextLine().charAt(0);

         if (ch>'a' && ch < 'z' || ch > 'A' && ch < 'Z'){
            System.out.println("Alphabet");
        }else System.out.println("Not Aalphabet");


    }
}
