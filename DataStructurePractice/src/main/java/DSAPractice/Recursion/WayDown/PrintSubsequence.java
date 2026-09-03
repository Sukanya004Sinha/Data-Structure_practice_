package DSAPractice.Recursion.WayDown;

import java.util.ArrayList;

public class PrintSubsequence {
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
        ArrayList<String> smallerAns= getss(smallestString);
        ArrayList<String> ans= new ArrayList<>();
        for(String ele: smallerAns) {
            ans.add(ele);

        }
        for(String ele: smallerAns ){
            ans.add(ch +ele);

        }


        return ans;
    }
}
