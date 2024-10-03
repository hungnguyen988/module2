package ss19.validate_ten_lop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_NAME_REGEX = "((A|C|P)[0-9]{4}(G|H|I|K))";

    public ClassName() {
        this.pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public static boolean validate(String className) {
        ClassName.matcher = pattern.matcher(className);
        return matcher.matches();
    }

}
