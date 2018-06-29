package trees;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mehari on 6/28/18.
 */
public class TrieTreePrefixSet {

    private static class TrieNodePrefix {
        Map<Character, TrieNodePrefix> map = new HashMap<Character,TrieNodePrefix>();
        boolean isEnd=false;

        public boolean isDuplicate(String word){
            TrieNodePrefix current = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(current.map.containsKey(c)){
                    TrieNodePrefix n = current.map.get(c);
                    //case 1: there exists a word that is a prefix to the current word
                    if(n.isEnd){
                        return true;
                    }
                    //case 2: the current word is a prefix to a previously inserted word
                    if(i==word.length()-1){
                        return true;
                    }
                    current=n;
                }else{
                    TrieNodePrefix n = new TrieNodePrefix();
                    if(i==word.length()-1){
                        n.isEnd=true;
                    }
                    current.map.put(c, n);
                    current=n;
                }
            }
            return false;
        }

    }
    //if it is a good set we return null if it is a bad set we return the word
    public static String  isBadSet(String[] words){
        TrieNodePrefix trieNodePrefix = new TrieNodePrefix();
        for (String word : words) {
            if(trieNodePrefix.isDuplicate(word)){
                return word;
            }
        }
        return null;
    }
}
