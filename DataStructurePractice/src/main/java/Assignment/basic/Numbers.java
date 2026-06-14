package Assignment.basic;

public class Numbers {

    static final String[] ones = {"one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", };

    static final String[] Tens = {"Twenty ", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};
    static final String[] units = {"Thousand", "Million", "Billion"};


    static  String belowThousand(int n) {
        StringBuilder sb = new StringBuilder();
        if (n >= 100) {
            sb.append(ones[n / 100]).append("Hundred");
            n %= 100;
        }
        if (n >= 19) {
            sb.append(Tens[n / 10]).append("Tens");
            sb.append(n%10);
        } else {
            sb.append(ones[n]);
        }
        return sb.toString();
    }

        static String numberToWords(long number){
        StringBuilder result = new StringBuilder();
        int index = 0;
           if(number> 0){
               int part = (int) (number%1000);
               if(part!=0){
                   String parts = belowThousand(part);
                   if(!parts.isEmpty()){
                       result.insert(0, parts);


                   }
               }
               number/=1000;
               index++;
           }

            return result.toString().trim() + "Only";
        }

    public static void main(String[] args) {
        System.out.println(numberToWords(500));
        System.out.println(numberToWords(6000));
        System.out.println(numberToWords(70000));
    }
    }




