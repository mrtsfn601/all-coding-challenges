package amazon;

/**
 * RunLength Encoding
 * Encode given string, order is important.
 * a => 1a
 * abcd => 1a1b1c1d
 * aaaabbccc => 4a2b3c
 * aaaabbccca => 4a2b3c1a
 * Source: https://www.youtube.com/watch?v=mjZpZ_wcYFg
 */
public class RunLengthEncoding {

    public static void main(String[] args) {
        System.out.println(findRunLengthEncoding("a").equals("1a"));
        System.out.println(findRunLengthEncoding("abcd").equals("1a1b1c1d"));
        System.out.println(findRunLengthEncoding("aaaabbccc").equals("4a2b3c"));
        System.out.println(findRunLengthEncoding("aaaabbccca").equals("4a2b3c1a"));
    }

    // traverse string as array of chars
    // count same chars in the sequence
    // need counter and previous char tracker

    private static String findRunLengthEncoding(String s) {
        if(s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 0;
        char prevChar = s.charAt(0);

        for(char c : s.toCharArray()) {
            if(prevChar == c) {
                count++;
            } else {
                result.append(count).append(prevChar);
                prevChar = c;
                count = 1;
            }
        }

        return result.append(count).append(prevChar).toString();
    }
}
