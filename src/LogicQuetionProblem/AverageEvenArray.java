package LogicQuetionProblem;
/*
4. *Average of Even Elements in an Array* 📊
        - *Input:* Array = [5, 10, 15, 20, 25, 30, 35, 50, 70]
        - *Output:* Average = 36.0
*/
public class AverageEvenArray {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25, 30, 35, 50, 70};
        float sum = 0;
        float count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (i%2==0){
                sum = sum +arr[i];
                count++;
            }
        }
        System.out.println(sum/count);
    }
}