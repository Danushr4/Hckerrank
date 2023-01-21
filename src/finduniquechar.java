import java.util.Scanner;

public class finduniquechar {
    static void removeDuplicate(String str, int n)
    {
        int c=0;
        for (int i = 0; i < str.length(); i++)
        {
            int flag = 0;
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j) && i != j)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                c++;
                System.out.print(str.charAt(i));
        }
     System.out.println(c);
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
//        String str= "asfddagha";
        int n = str.length();
        removeDuplicate(str, n);
    }
}
