import java.util.Scanner;

public class ipaddleet {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String ad = in.next();
//        // String ne = in.next();
//        String ne ="";
//        for(int i=0;i<ad.length();i++){
//            if(ad.charAt(i)=='.')
//            {
//                ne = ne + "[.]";
//            }
//            else{
//                ne = ne + ad.charAt(i);
//            }
//        }
//        System.out.println(ne);
//    }
    public static void main(String[] args){
        String s = "codeleet";
        String r = "codeleet";
        int indices[] ={4,5,6,7,0,2,1,3};
        int n = indices.length;
        for(int i=0;i<n;i++){
            System.out.println(s.charAt(indices[i]));
        }
    }
}
