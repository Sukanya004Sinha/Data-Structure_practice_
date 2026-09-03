package DSAPractice.Recursion.WayDown;

import java.util.ArrayList;

public class GetKPC {
    public static void main(String[] args) {
        System.out.println(getKpc("89"));
    }
    static String[] keys = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    public static ArrayList<String> getKpc(String str) {
        if (str.length() == 0) {
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        char firstChar = str.charAt(0);
        String smallestString = str.substring(1);
        ArrayList<String> smallerAns = getKpc(smallestString);
        ArrayList<String> ans = new ArrayList<>();
        int firstNum = firstChar - '0';
        String key = keys[firstNum];
        for (int i = 0; i < key.length(); i++) {
            char keyChar = key.charAt(i);

            for (String sans : smallerAns) {
                ans.add(keyChar + sans);
            }

        }
            return ans;

    }
}
