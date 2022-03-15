package interviewCodingQuestion;

import java.util.Scanner;

public class permutation {
    public static int permutation(String s){
        int fact =1;
        int n = s.length();

        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(permutation(s));
        
    }
    
}
