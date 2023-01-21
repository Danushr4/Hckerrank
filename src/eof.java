import java.util.Arrays;
import java.util.Scanner;

public class eof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        //int n = s.length();
//        String str = "Geeks for Geeks";
        String[] arrOfStr = str.split(" ");


        for (String a : arrOfStr)
            System.out.println(a);
    }
}
