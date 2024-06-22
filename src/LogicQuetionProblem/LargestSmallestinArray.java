package LogicQuetionProblem;

/*5. *Find the Largest and Smallest Number in an Array* 🔍
        - *Input:* Array = [3, 8, 1, 12, 5]
        - *Output:* Largest = 12, Smallest = 1*/
public class LargestSmallestinArray {

    public static void main(String[] args) {

        int arr[] = {3, 8, 1, 12, 5};
      int temp1 = arr[0];
      int temp2 = arr[0];
      for (int i = 0; i < arr.length; i++) {
            if (arr[i]>temp1){
                // max
                temp1 = arr[i];
            }
            if (arr[i]<temp2){
                temp2 = arr[i];
            }
        }
        System.out.println(temp1+" high");
        System.out.println(temp2+" low");


    }
}
