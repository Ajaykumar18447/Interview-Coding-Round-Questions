/*
Sum OF Leader 
int a[] = {52,66,64,36,45,24,32}

output = 32+45+64+66=207
explanation => start from last 32 iterate if arr[i]> maxleft side all the add 
*/
package interviewCodingQuestion;

public class SumOfLeaders {
    public static int leader(int arr[],int n){
        n =arr.length;
        if(n==0){
            return -1;
        }
        int sum = arr[n-1];
        int max =arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max =arr[i];
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]= {52,66,64,36,45,24,32};
        int n = arr.length;

        System.out.println(leader(arr, n));
    }


    
}
