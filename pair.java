package interviewCodingQuestion;

public class pair {
    public static int calpair(int num[]){
        int pair=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>2*num[j]){
                    pair +=1;
                }
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        int num[] = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(calpair(num));
    }
    
}
