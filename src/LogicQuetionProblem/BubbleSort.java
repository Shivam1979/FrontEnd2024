package LogicQuetionProblem;
/*8. *Bubble Sort Algorithm* 🛁
        - *Input:* Array = [64, 34, 25, 12, 22, 11, 90]
        - *Output:* Sorted Array = [11, 12, 22, 25, 34, 64, 90]*/
import java.lang.reflect.Array;
import java.util.Arrays;
public class BubbleSort {
    public void BubbleSearch( int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){ //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort b = new BubbleSort();
        b.BubbleSearch(arr);
        System.out.println(Arrays.toString(arr));
    }
}
