package ex1;

/**
 * Exercise ex1_1: String utilities.
 * Provides a utility to invert the case of letters in a string.
 */
public class ex1_1 {
    /**
     * Return a new string where lowercase letters are converted to uppercase
     * and uppercase letters to lowercase. Non-letter characters are left unchanged.
     * If the input is null, returns null.
     *
     * @param s input string (may be null)
     * @return case-inverted string or null
     */
    public static String invertCase(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // swap letter case, leave other characters untouched
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}