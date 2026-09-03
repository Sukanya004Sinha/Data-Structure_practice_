package DSAPractice.Recursion;

import java.util.ArrayList;

public class keyCombinations {

    static String[] keys = {
            ";#",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqr",
            "stu",
            "vwx",
            "yz"
    };

    public static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        // First character
        char firstch = str.charAt(0);

        // Remaining string
        String smallerString = str.substring(1);

        // Recursive call
        ArrayList<String> smallAns = getKPC(smallerString);

        // Get corresponding key
        int firstNum = firstch - '0';
        String key = keys[firstNum];

        // Final answer
        ArrayList<String> ans = new ArrayList<>();

        // For every character in current key
        for (int i = 0; i < key.length(); i++) {

            char keyChar = key.charAt(i);

            // Combine with every recursive answer
            for (String sans : smallAns) {
                ans.add(keyChar + sans);
            }
        }

        return ans;
    }

    public static void printStairPath(int n, String ps){
        if(n < 0){
            return;
        }

        if(n == 0){
            System.out.println(ps);
            return;
        }

        printStairPath(n-1, ps + "1");
        printStairPath(n-2, ps + "2");
        printStairPath(n-3, ps + "3");
    }




    public static void main(String[] args) {

        System.out.println(getKPC("23"));

    }
}