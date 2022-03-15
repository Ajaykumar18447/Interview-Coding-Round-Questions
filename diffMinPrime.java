package interviewCodingQuestion;

import java.util.Scanner;

public class diffMinPrime {
    public static int diffmin(int n){
        int min = 2;
        while(n>1){
            if(min%2==0){
                break;
            }
            min++;
        }
        return n-min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(diffmin(n));
    }
    
}
