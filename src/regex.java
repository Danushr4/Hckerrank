import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
//        String pattern = "(([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Scanner in = new Scanner(System.in);
        String pattern = "[a-zA-Z]?";
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(pattern));
        }
    }
}
