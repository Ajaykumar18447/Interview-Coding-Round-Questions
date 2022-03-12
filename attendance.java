/*

The student was absent ('A') for strictly fewer than 2 days total.
The student was never late ('L') for 3 or more consecutive days.

Input: s = "PPALLP"
Output: true
Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.

*/

package interviewCodingQuestion;

public class attendance {
    public static boolean checkAttendance(String s){
        int countA =0; 
        int countL = 0;
    for(int i=0;i<s.length();i++){
        
        if(s.charAt(i) == 'A'){
            countA += 1;
            countL = 0;
            if(countA > 1) {
                return false;
            }
        }
        

        else if(s.charAt(i)=='L'){
            countL += 1;
        
        if(countL >= 3){
            return false;
        }
    }else{
        countL=0;
    }
        
    }
    return true;
}

public static void main(String[] args) {
    String s = "PPALLP";

    System.out.println(checkAttendance(s));
}


    
}
