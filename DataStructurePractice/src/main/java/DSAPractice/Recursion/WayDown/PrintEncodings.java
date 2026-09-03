package DSAPractice.Recursion.WayDown;

public class PrintEncodings {
    public static void main(String[] args) {
        printEncodings("123", "");

    }
    public static void printEncodings(String str, String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        int firstNum = str.charAt(0)-'0';
        if(firstNum==0){
            return;
        }
        char convertedletter = (char) ('a' + (firstNum-1));
        String smallerString = str.substring(1);
        printEncodings(smallerString, asf+convertedletter);
        if(str.length()>=2){
            String first2letters =str.substring(0,2);
            int first2Num = Integer.parseInt(first2letters);
            if(first2Num<=26){
                convertedletter= (char)('a' +first2Num-1);
                smallerString = str.substring(2);
                printEncodings(smallerString, asf+convertedletter);
            }
        }
    }
}
