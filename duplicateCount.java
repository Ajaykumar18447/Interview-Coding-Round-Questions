/*
Given a sorted integer array containing duplicate return the count of occurence of a given number 
input num[] = [ 2,5,5,5,6,6,8,9,9] target =5
output = 3;
*/
package interviewCodingQuestion;

public class duplicateCount {
    public static int count(int num[] , int target){
        int count=0;
        for(int i=0;i<num.length;i++){
            if(target==num[i])
            count++;
            else return -1;

        }
        return count;
    }
    public static void main(String[] args) {
        int num[]={2,5,5,5,6,6,8,9,9};
        int target=0;
        System.out.println(count(num, target));
    }
    
}
