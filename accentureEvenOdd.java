/*
n = 5

if number is even -> n/2
if number is odd -> n-1
till n !=0

number of count return
n=5
odd -> 4
even ->2
even -> 1
odd -> 1-1 = 0

step =4;
*/
package interviewCodingQuestion;

import java.util.Scanner;

public class accentureEvenOdd {
    public static int countStep(int num){
        int step =0;
        while(num!=0){
            if(num%2==0){
                num =num/2;
            }else{
                num =num-1;
            }
            step++;
        }
        return step;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countStep(num));
    }
    
}
