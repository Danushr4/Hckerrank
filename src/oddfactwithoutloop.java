import java.util.Scanner;

public class oddfactwithoutloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(Math.floor(Math.sqrt(m)) - Math.ceil(Math.sqrt(n))+1)
        ;
    }
}
