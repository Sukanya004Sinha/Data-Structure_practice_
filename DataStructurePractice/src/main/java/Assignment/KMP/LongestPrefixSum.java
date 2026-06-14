package Assignment.KMP;

public class LongestPrefixSum {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        lps(text,pattern);
    }

    public static void lps(String text, String pattern){
        int n =text.length();
        int m =pattern.length();
        for(int i =0;i<=n-m;i++){
            int j = 0;
            while(j<m) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;

                }
                j++;
            }
            if(j==m){
                System.out.println("pattern found at index" +i);
            }
        }
    }
}
