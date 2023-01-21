import java.util.Scanner;

public class chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  String userName = sc.nextLine();
        int n =Integer.parseInt(sc.nextLine());
        String regularExpression = "^[A-Za-z]\\w{7,29}$";
        while(n-- !=0)
        {
            String userName = sc.nextLine();
            if (userName.matches(regularExpression))
            {
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}