import java.util.HashSet;
import java.util.Set;

public class substring {
    public static void main(String[] args) {
        String patterns[] = {"a","b","c"};
        String word = "aaaaabbbbb";
        Set<String> set = new HashSet<>();
        for(int i = 0; i <= word.length(); i++)
        {
            for(int j = i; j <= word.length(); j++)
            {
                set.add(word.substring(i,j));
            }
        }
        System.out.println(set);
        int res = 0;
        for(String p : patterns)
            if(set.contains(p))
                res++;
        System.out.println(res);
    }
}
