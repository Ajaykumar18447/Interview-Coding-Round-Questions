/*
5 ! =120
trailing zero is 1

10! = 3628800
trailing zero is 2

trailing means last zero

intution building - n/5 to obtail trailing zero
if num > 5 then further divide num/5;

otherwise print the value.

*/

package interviewCodingQuestion;

import java.util.Scanner;

public class trailingZeros {
    public static int trailing(int num){

        int count =0;

        for(int i=5;num/i>=1;i=i*5){
            count = count+num/i;
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(trailing(num));
    }
    
}
