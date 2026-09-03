package DSAPractice.Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static ArrayList<String> getSubsequences(String str) {
        ArrayList<String> bans = new ArrayList<>();
        if(str.length()==0){
            bans.add("");
            return bans;
        }

        ArrayList<String> ans = new ArrayList<>();
        char firstch = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> smallAns = getSubsequences(subString);
        for(String withsm: smallAns){
           ans.add(firstch +withsm);
        }
        for(String withoutsm: smallAns) {
            ans.add(withoutsm);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getSubsequences("abc"));
    }
}
