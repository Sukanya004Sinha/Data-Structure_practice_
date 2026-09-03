package DSAPractice.String;

public class ToggleCharacters {
    public static void main(String[] args) {
        String s = "abcKK#";
        System.out.println(toggleCase(s));

    }

    public static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char upperCase = (char) (ch - ('a' - 'A'));

                sb.append(upperCase);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lowerCase = (char) (ch + ('a' - 'A'));
                sb.append(lowerCase);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}