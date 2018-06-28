package trees;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mehari on 6/27/18.
 */
public class TrieNode {
    Map<Character, TrieNode> map;
    boolean isEnd;

    public TrieNode(){
        map=new HashMap<Character, TrieNode>();
    }

    public void insert(String word){
        TrieNode current =this;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!current.map.containsKey(c)){
                TrieNode n = new TrieNode();
                if(i==word.length()-1){
                    n.isEnd=true;
                }
                current.map.put(c,n);
                current=n;
            }else{
                TrieNode n = current.map.get(c);
                current=n;
            }
        }
    }

    public boolean hasPrefix(String prefix){
        TrieNode current = this;
        for(int i=0; i<prefix.length(); i++){
            Character c = prefix.charAt(i);
            if(current.map.containsKey(c)){
                current=current.map.get(c);
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean hasWord(String word){
        TrieNode current = this;
        for(int i=0; i<word.length(); i++){
            Character c = word.charAt(i);
            if(current.map.containsKey(c)){
                current=current.map.get(c);
            }else{
                return false;
            }
        }
        return current.isEnd;
    }
}
