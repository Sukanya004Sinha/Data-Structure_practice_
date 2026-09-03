package DSAPractice.String;

import java.util.Scanner;

class Questions {
    public static String compressString(String str) {

            if (str.length() == 0) {
                return "";
            }

            String ans = "";

             ans+= str.charAt(0);
             for (int i =1;i<str.length();i++){
                 if(str.charAt(i)!=str.charAt(i-1)){
                     ans+=str.charAt(i);
                 }
             }
             return ans;

           }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println(compressString(str));
    }
}