package unionfind;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/20/18.
 */
public class BabyNamesTest {

    @Test
    public void testGetCount() throws Exception {
        ArrayList<String[]> synonyms = new ArrayList<String[]>();
        synonyms.add(new String[]{"Jon", "John"});
        synonyms.add(new String[]{"John", "Johnny"});
        synonyms.add(new String[]{"Chris", "Kris"});
        synonyms.add(new String[]{"Chris", "Christopher"});

        HashMap<String, Integer> namesCount = new HashMap<String, Integer>();
        namesCount.put("John" ,15);
        namesCount.put("Jon" ,12);
        namesCount.put("Chris" ,13);
        namesCount.put("Kris" ,4);
        namesCount.put("Christopher" ,19);

        Map<String, Integer> actual =BabyNames.getCount(synonyms,namesCount);
        assertTrue(actual.get("Jon")==27);
        assertTrue(actual.get("Chris")==36);


    }
}