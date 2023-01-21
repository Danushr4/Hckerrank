import java.util.Arrays;
import java.util.Scanner;

public class newlinestring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] arr = s.split("[' '!?,._`@]");
        System.out.println(arr.length-1);
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]==" ") {
                arr[i]=arr[i+1];
               System.out.println(arr[i]);
            }
            else {
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));

//       for (String a : arr)
//            System.out.println(a);
    }
    }

