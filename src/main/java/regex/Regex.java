package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    static String allAtLeast3Digit(String input) {
        StringBuilder result = new StringBuilder("");
        String patter = "(\\d){3}(\\d)*";
        Pattern patt = Pattern.compile(patter);
        Matcher matcher = patt.matcher(input);

        while (matcher.find()) {
            result.append(matcher.group());
            result.append(", ");
        }

        int length = result.length();
        if (length > 0)
            result.delete(length - 2, length);

        return result.toString();
    }
}
