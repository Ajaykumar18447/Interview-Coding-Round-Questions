package interviewCodingQuestion;

import java.util.Scanner;
import java.util.Stack;

public class curlyBraces {
    public static boolean curly(String s){
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray())
        if(c=='{'){
            st.add(c);
        }else{
            if(st.isEmpty()){
                return false;
            } 
            if(c=='}'&& st.peek() != '{') return false;

            st.pop();
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(curly(s)==true){
            System.out.println("successfull");
        }else{
            System.out.println("compilation error");
        }
    }
    
}
