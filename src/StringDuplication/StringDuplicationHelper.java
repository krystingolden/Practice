package StringDuplication;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicationHelper {

    static char[] removeDuplicates(char []s,int n){
        Map<Character,Integer> exists = new HashMap<>();

        String st = "";
        for(int i = 0; i < n; i++){
            if(!exists.containsKey(s[i]))
            {
                st += s[i];
                exists.put(s[i], 1);
            }
        }
        return st.toCharArray();
    }

    public static void stringDuplicatesTest(){
        char s[] = "happynewyear".toCharArray();
        int n = s.length;
        System.out.print(removeDuplicates(s,n));
    }
}
