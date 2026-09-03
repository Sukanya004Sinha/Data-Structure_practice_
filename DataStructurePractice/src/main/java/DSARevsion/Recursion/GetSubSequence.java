package DSARevsion.Recursion;

import java.util.ArrayList;

public class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  GetSubSequence {
    public static void main(String[] args) {
        System.out.println(getss("abc"));

    }
    public static ArrayList<String> getss(String str){
        if(str.length()==0){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        char ch = str.charAt(0);
        String smallestString = str.substring(1);
        ArrayList<String> smallestAns= getss(smallestString);
        ArrayList<String> ans = new ArrayList<>();
        for (String s: smallestAns){
            ans.add(ch+ s);
        }
        for (String s: smallestAns){
            ans.add(s);
        }
        return ans;
    }
}
