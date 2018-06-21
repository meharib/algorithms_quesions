package unionfind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mehari on 6/20/18.
 */
public class BabyNames {
    private static void parseSynonyms(String[] namePair, List<String> names, List<Integer> index){
        if(names.contains(namePair[0]) && !names.contains(namePair[1])){
            names.add(namePair[1]);
            index.add(index.get(names.indexOf(namePair[0])));
        }
        else if(!names.contains(namePair[0]) && names.contains(namePair[1])){
            names.add(namePair[0]);
            index.add(index.get(names.indexOf(namePair[1])));
        }
        else{
            names.add(namePair[0]);
            names.add(namePair[1]);
            int i= names.indexOf(namePair[0]);
            index.add(i); index.add(i);
        }
    }

    private static Map<String, Integer> count(Map<String, Integer> nameCount, ArrayList<String> names, ArrayList<Integer> indexes){
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(String nc: nameCount.keySet()){
            if(names.indexOf(nc)!=-1){
                String rootName= names.get(indexes.get(names.indexOf(nc)));
                int previous = result.get(rootName)==null?0:result.get(rootName);
                int total= previous + nameCount.get(nc);
                result.put(rootName, total);
            }
        }
        return result;
    }

    public static Map<String, Integer> getCount(ArrayList<String[]> synonyms,HashMap<String, Integer> nameCount){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (String[] synonym : synonyms) {
            parseSynonyms(synonym,names,indexes);
        }
        return count(nameCount,names,indexes);
    }
}
