package miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mehari on 7/4/18.
 */
public class SmallestSubStringOfChars {
    static String getShortestUniqueSubstring(char[] arr, String str) {
        // your code goes here
        List<String> substring = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            HashMap<Character, Integer> charMap = getCharMap(arr);
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);
                if(charMap.containsKey(c)){
                    Integer charCount = charMap.get(c);
                    if(charCount>1){
                        charMap.put(c, charCount-1);
                    }else if(charCount==1){
                        charMap.remove(c);
                    }
                }
                if(charMap.isEmpty()){
                    substring.add(str.substring(i,j+1));
                }
            }

        }
        String result =str;
        if(substring.isEmpty()){
            return "";
        }
        for (String s : substring) {
            if(s.length()<result.length()){
                result=s;
            }
        }
        return result;
    }

    private static HashMap<Character, Integer> getCharMap(char[] arr) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char c : arr) {
            if(charCount.containsKey(c)){
                Integer count = charCount.get(c);
                charCount.put(c, count+1);
            }else{
                charCount.put(c, 1);
            }
        }
        return charCount;
    }

}
