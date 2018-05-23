import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Mehari on 5/22/18.
 */
public class LongestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        if(length==0) return 0;
        int[] count = new int[length];
        Map<Character,Integer> unique = new HashMap<Character,Integer>();
        count[0]=1;
        unique.put(chars[0],0);
        int max=count[0];
        for (int i = 1; i < length; i++) {
            char key = chars[i];
            if(unique.containsKey(key)){
                count[i]=Math.min((i-unique.get(key)),(count[i-1]+1));
            }else{
                count[i]=count[i-1]+1;
            }
            unique.put(key,i);
            if(count[i]>max) max=count[i];
        }
        return max;

    }
}
