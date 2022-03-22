
package interviewCodingQuestion;

public class printPermutation {
    public static void printPermu(String str , String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            String qlpart = str.substring(0, i);
            String rlpart = str.substring(i+ 1);

            String rop = qlpart + rlpart;
            printPermu(rop, asf+ch);

        }

    }
    public static void main(String[] args) {
        String str = "abc";
        printPermu(str, " ");
    }
    
}
