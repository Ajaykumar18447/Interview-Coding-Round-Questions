/*
Doug is fond of change , every now and then he tries to do new things. 
This time he caught up with a rod comprising of negative(N) and positive(P) charge.
 He is asked to calculate the maximum net electrostatic field possible in region due to the rod.

 input 1 = [4,3,5]
 input 1 = [P,N,P]
 input 3 = 3
 output = 600
 explation ->(4-3+5)*100 = 600


 input 2 = [2,3]
 input 2 = [P,N]
 input 2 = 3
 output = 100
 explation ->(2-3)*100 = -100 => absolute become 100


 Note - E.f = Total charge * 100;

*/
package interviewCodingQuestion;

import java.util.Scanner;

public class electrostatic {
    public static int electr(int num[] ,char value[] , int n){
        int sum =0;

        for(int i=0;i<n;i++){
            if(value[i] == 'P'){
                sum += num[i];
            }else{
                sum -= num[i];
            }

            sum =Math.abs(sum);
        }

        return sum*100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = {4,3,5};
        char value[] = {'P','N','P'};
        int n = 3;
        System.out.println(electr(num, value, n));
    }
    
}
