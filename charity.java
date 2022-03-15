/*
started from day one to day n..
i^2 coin donate ; 
*/

package interviewCodingQuestion;

import java.util.Scanner;

public class charity {
public static int donate(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum += i*i;
    }
    return sum;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println(donate(n));
}

    
}
