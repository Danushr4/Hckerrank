import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("num");
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        System.out.println("op");
        int m = in.nextInt();
        for(int i=0;i<m;i++){
            String s = in.next();
            if(s.equals("Insert")){
                System.out.println("indpos");
                int ind = in.nextInt();
                int pos = in.nextInt();
                arr.add(ind,pos);
            }
            else if(s.equals("Delete")){
                System.out.println("del");
                int del = in.nextInt();
                arr.remove(del);
            }
        }
        for(int a : arr){
            System.out.println(a);
        }
    }
}
