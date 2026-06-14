package Assignment.prefixSum;

class MaxScore {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s) {

        int totalOnes = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                totalOnes++;
            }
        }

        int zerosLeft = 0;
        int onesLeft = 0;
        int maxScore = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '0') {
                zerosLeft++;
            } else {
                onesLeft++;
            }

            int onesRight = totalOnes - onesLeft;

            maxScore = Math.max(maxScore, zerosLeft + onesRight);
        }

        return maxScore;
    }
}
