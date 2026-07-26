package Assignment.String;

import java.util.Scanner;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};

       LongestCommonPrefix longestCommonPrefix  = new LongestCommonPrefix();
       String ans = longestCommonPrefix .longestCommonPrefix(strs);
        System.out.println(ans);

    }
    public String longestCommonPrefix(String[] strs) {
        for(int i =0;i<strs[0].length();i++){
            char ch= strs[0].charAt(i);
            for(int j = 1;j<strs.length;j++){
             if(i==strs[j].length() || strs[j].charAt(i)!= ch){
                 System.out.println("ss" +(i==strs[j].length() || strs[j].charAt(i)!= ch));
                    return strs[0].substring(0, i);
                }
//               String s=   strs[j];
//                System.out.println(s);

            }



        }

        return strs[0];



    }
}
