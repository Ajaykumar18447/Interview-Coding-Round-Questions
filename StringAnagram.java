/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/
package interviewCodingQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class StringAnagram {
    public static boolean anagram(String s , String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char ch =s.charAt(i);

            map.put(ch, map.getOrDefault(ch , 0) +1);
        }
        for(int i=0;i<t.length();i++){
            char ch =t.charAt(i);

            if(map.containsKey(ch)==false){
                return false;
            }
            else if(map.get(ch)==1){
                map.remove(ch);
            }else{
                map.put(ch, map.get(ch)-1);
            }
        }
        return map.size()==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(anagram(s, t));
    }

    
    
}
