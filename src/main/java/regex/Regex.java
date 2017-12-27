package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    static String allAtLeast3Digit(String input) {
        String patter = "(\\d){3}(\\d)*";
        Pattern patt = Pattern.compile(patter);
        Matcher matcher = patt.matcher(input);

        if (matcher.find())
            return matcher.group();
        else
            return "";
    }
}
