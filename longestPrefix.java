package interviewCodingQuestion;

public class longestPrefix {
    public static String longestPrefix(String str[]){
        if(str.length==0) return "";

        String min = str[0];

        for(int i=1;i<str.length;i++){

            while(str[i].indexOf(min) !=0){
                min = min.substring(0,min.length()-1);

                if(min.isEmpty()){
                    return "";
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        System.out.println(longestPrefix(str));
    }
    
}
