import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<String> st = new Stack<String>();
        String str = in.next();
        String str2[] = str.split("");
        for(int i=0;i<str.length();i++){
            if(str2[i]=="(" || str2[i]=="{"||str2[i]=="["){
                st.push(str2[i]);
            }
            else{
                if(st.isEmpty()){
                    System.out.println("fal");
                }
                else{
                    String st1 = st.pop();
                    if(str2[i]==")" && str2[i]!="("){
                        System.out.println("fal");
                    }
                    else if(str2[i]=="}" && str2[i]!="{"){
                        System.out.println("fal");
                    }
                    else if(str2[i]=="[" && str2[i]!="]"){
                        System.out.println("fal");
                    }
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("tru");
        }
        System.out.println(st);
    }
}
