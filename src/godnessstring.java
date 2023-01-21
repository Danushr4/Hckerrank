import java.util.Scanner;

public class godnessstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j=0;j<t;j++){
            int slen = in.nextInt()-1;
            int god = in.nextInt();
            String str = in.next();
            int count=0;
            if(god==1){
                System.out.println("0");
            }
            else {
                for(int i=1;i<str.length()/2;i++){
                    if(str.charAt(i)!=str.charAt(slen-i+1)){
                        count++;
                    }
                }
                if(count<god){
                    System.out.println(god-count);
                }
                else{
                    System.out.println(count-god);
                }
        }

        }

    }
}
