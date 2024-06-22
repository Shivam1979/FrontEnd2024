package LogicQuetionProblem;


/*15. *Calculate the Average of the all the row in Square Matrix* ↔
        - *Input:* Matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        - *Output:* R1:2.0
                    R2:5.0
                    R3:8.0
*/
public class CalculateAverageArrayMatrix {
    public static void main(String[] args) {
int str [][]={
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
};
Average(str);
    }
   static void Average(int arr[][]){
        float r1 =0;
        float r2 =0;
        float r3 =0;
        for (int i = 0; i <arr[0].length; i++) {
            for (int j = 0; j <arr.length; j++) {
               // System.out.print(arr[i][j]+" "+i+" "+j);
                if (i==0){
                    r1 +=arr[i][j];
                }else if (i==1){
                    r2 +=arr[i][j];
                }else  r3 +=arr[i][j];
            }
        }
       System.out.println(r1/arr[0].length);
       System.out.println(r2/arr[0].length);
       System.out.println(r3/arr[0].length);
    }
}
