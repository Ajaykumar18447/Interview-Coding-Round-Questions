import java.util.HashSet;

/*
input 1 = [1,2,1,5,4,5]
output = 4
*/
public class countDistinctElemet {
public static int count(int nums[]){

    HashSet <Integer> set = new HashSet<>();
    for(int arr :nums){
        set.add(arr);
    }
    return set.size();
}
public static void main(String[] args) {
    int nums[]={1,2,1,5,4,5};
    System.out.println(count(nums));
}
    
}
