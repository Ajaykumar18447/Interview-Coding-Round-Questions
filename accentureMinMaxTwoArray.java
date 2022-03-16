/*
a1 = [9,16,12,,15]
a2 = [14,7,22,5,32,77]
k=9;

o/p = 3

explanation - maximum digit from k in a1 = 3
            - minimum digit from k in a2 = 2
    max(3,2)= 3;
*/
package interviewCodingQuestion;

public class accentureMinMaxTwoArray {
    public static int maxMin(int a1[],int a2[],int k){
        int count1 =0;
        int count2 =0;

        for(int i=0;i<a1.length;i++){
            if(a1[i]>k){
                count1++;
            }
        }
        for(int i=0;i<a2.length;i++){
            if(a2[i]<k){
                count2++;
            }
        }
        int res = Math.max(count1, count2);

        return res;
    }
    public static void main(String[] args) {
        int a1[]={9,16,12,15};
        int a2[]={14,7,22,5,32,77};

        int k =9;

        System.out.println(maxMin(a1, a2, k));
    }
}
