package Assignment.basic;

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 * A subsequence of a string is a new string generated from the original
 * string with some characters (can be none) deleted without changing the relative orde
 * r of the remaining characters.
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 *
 * Example 1:
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 */
public class Test05 {

    public static void main(String[] args) {
        String text1 = "b";
         String text2 = "a";

         int ans = lcs(text1, text2, 0, 0);
        System.out.println(ans);
    }

        public static int lcs(String text1, String text2, int i , int j){

        if(i == text1.length() || j ==text2.length()){
            return  0;
        }
        if(text1.charAt(i) ==text2.charAt(j)){
            return 1+ lcs(text1, text2 , i +1, + j+1);


        }


        int skipText1 = lcs(text1, text2, i +1, + j);
        int skipText2 = lcs(text1, text2,  i , + j+1);

        return  Math.max(skipText1, skipText2);



    }
}
