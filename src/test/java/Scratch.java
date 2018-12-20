import org.junit.Test;
import trees.*;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Mehari on 6/4/18.
 */


public class Scratch {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord) || beginWord==null || endWord==null) return 0;
        int level = 1;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(beginWord);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                String word = queue.poll();
                if(word.equals(endWord)) return level;
                visited.add(word);
                List<String> relatedWords = getRelatedWords(word, wordList, visited);
                for (String relatedWord : relatedWords) {
                    if(relatedWord.equals(word)) return level+1;
                    queue.offer(relatedWord);
                }
            }
            level++;
        }
        return 0;
    }

    private List<String> getRelatedWords(String word, List<String> wordList,Set<String> visted) {
        List<String> result = new ArrayList<>();
        for (String candidateWord : wordList) {
            if(!visted.contains(candidateWord) && areRelated(word, candidateWord)){
                result.add(candidateWord);
            }
        }
        return result;
    }

    private boolean areRelated(String word, String candidateWord) {
        if(word.length()!=candidateWord.length()) return false;
        int diff =0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)!=candidateWord.charAt(i)){
                diff++;
            }
        }
        return diff==1;
    }


    @Test
    public void test1(){
        List<String> list = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int length = ladderLength("hit", "cog", list);
        assertEquals(5, length);
    }


}
