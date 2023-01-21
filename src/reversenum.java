import java.util.Scanner;

public class reversenum {
    public static String rev(int x){

        String str = Integer.toString(x);
        String str1 ="";
        int n = str.length();
        for(int i=n-1;i>=0;i--)
        {             // in order to reverse number you can use palindrome concept
            str1 = str1 + str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(Integer.valueOf(rev(n)));

    }
}
