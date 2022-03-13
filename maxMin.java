/*Find the maximum and minimum element in an array

arr = 9,8,4,7,2,4
*/


package interviewCodingQuestion;

public class maxMin {

    public static void maxMin(int arr[]){
        int max = arr[0];
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


        
    }

    public static void main(String[] args) {
        int arr[] = {9,8,4,7,2,4};
       
        maxMin(arr);
    }
    
}
