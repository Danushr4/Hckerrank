import java.text.NumberFormat;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regexpattern {
    public static String duplicate(String str) {
        str = str.toLowerCase();
        String[] str1 = str.split(" ");
        Set<String> s = new LinkedHashSet<>();
        for (String x : str1) {
            s.add(x);
        }
        String message = String.join(" ", s);
        return message;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str = in.next();
            System.out.println(duplicate(str));
        }

    }
}