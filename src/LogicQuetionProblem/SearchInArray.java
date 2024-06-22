package LogicQuetionProblem;
/*7. *Search an Element in an Array and Write the Index Number* 🔎
        - *Input:* Array = [10, 20, 30, 40, 50], Element = 30
        - *Output:* Index = 2*/


public class SearchInArray {

    public static int SearchElement(int key , int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println(SearchElement(key,arr));


    }
}
