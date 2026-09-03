package DSAPractice.Arrays;

public class PrintEncodings {
    public static void main(String[] args) {
        printEncodings("00", "");
    }
    public static String printEncodings(String str , String asf){
        if(str.length()==0){
            System.out.println(asf);
            return str;
        }
        // we can take one character at a time
        char firstChar = str.charAt(0);
        int firstNum = firstChar-'0';
        if(firstChar=='0'){
            return str;
        }

        char convertedLetter = (char)('a'+ (firstNum-1));
        String smallerString  = str.substring(1);
        printEncodings(smallerString, asf+convertedLetter);
        //we can take 2 character at a time
        if(str.length()>=2){
            String first2letters = str.substring(0,2);
            int first2Num = Integer.parseInt(first2letters);
            if(first2Num<=26){
                convertedLetter = (char)('a'+ first2Num-1);
                smallerString = str.substring(2);
                printEncodings(smallerString,asf+convertedLetter);
            }

        }

        


        return asf;

    }

}
