package password_codegym_util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCodeGymUtil {
    private static final String REGEX_PASSWORD_1 = ".*[A-Z].*";
    private static final String REGEX_PASSWORD_2 = ".*[a-z].*";
    private static final String REGEX_PASSWORD_3 = ".*[0-9].*";
    private static final String REGEX_PASSWORD_4 = ".*@.*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        boolean checkPassword = isValidPassword(string);
        System.out.println(checkPassword);
    }

    private static boolean isValidPassword(String string){
        return Pattern.matches(REGEX_PASSWORD_1,string) && Pattern.matches(REGEX_PASSWORD_2,string)
                && Pattern.matches(REGEX_PASSWORD_3,string) && Pattern.matches(REGEX_PASSWORD_4,string);
    }
}
