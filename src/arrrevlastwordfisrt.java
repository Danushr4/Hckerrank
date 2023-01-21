import java.util.Scanner;

public class arrrevlastwordfisrt {
    public static String Word(String str){
        String temp ="";
        String rev ="";
        int n = str.length();
        for (int i = 0; i < str.length() ; i++)
        {
            temp = temp + str.charAt(i);
            if ((str.charAt(i) == ' ' || i==n-1)) {

                    rev = temp +" "+rev;
                temp ="";
            }
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        String revStr = Word(str);
        System.out.println(revStr);
    }
}
