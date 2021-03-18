package regex;

import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[g-m]+\\s[aeyiuo]{2}", "gg ae"));

        /*
         * System.out.println(Pattern.matches("[g-m]+\\s\\w*[aeyiuo]\\w*[aeyiuo]\\w*",
         * "gg wareren")); System.out.println(Pattern.matches("\\W", "#"));
         * System.out.println(Pattern.matches("[k-p]*", "mkp"));
         * System.out.println(Pattern.matches("[k-p]{2,4}.+", "koma"));
         * System.out.println(Pattern.matches("[xyz]", "wbcd"));
         * System.out.println(Pattern.matches("[xyz]", "x"));
         * System.out.println(Pattern.matches("[xyz]", "xxyyzz")); Pattern pattern =
         * Pattern.compile("[^st].abba"); Matcher matcher = pattern.matcher("snabba");
         * 
         * System.out.println("String matches the given pattern " + matcher.matches());
         * 
         * String test_string = "lorem ipsum swing"; String[] splitter =
         * test_string.split("s");
         * 
         * System.out.println(splitter[0]); System.out.println(splitter[1]);
         * System.out.println(splitter[2]);
         */
    }

}