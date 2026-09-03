package DSAPractice.String;

import java.util.Scanner;

public class Compress2 {
    public static String compressString(String str) {

        if (str.length() == 0) {
            return "";
        }

        String ans = "";

        ans += str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else { //new character
                if (count > 1) {
                    ans += count;
                }
                ans += str.charAt(i);

                count = 1;//re-initaliziling count 1 with new
            }
        }
        if(count>1){
            ans+=count;
        }
            return ans;

        }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println(compressString(str));
    }
}

