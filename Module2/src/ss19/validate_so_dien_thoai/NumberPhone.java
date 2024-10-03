package ss19.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_NAME_REGEX = "([0-9]{2}-(0[0-9]{9}))";

    public NumberPhone() {
        this.pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public static boolean validate(String className) {
        NumberPhone.matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
