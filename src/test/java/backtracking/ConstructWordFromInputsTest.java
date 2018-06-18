package backtracking;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/18/18.
 */
public class ConstructWordFromInputsTest {

    @Test
    public void testCanConstruct_1() throws Exception {
        boolean actual = ConstructWordFromInputs.canConstruct(new String[]{"er", "int", "bar", "view"}, "interview");
        assertTrue(actual);
    }
    @Test
    public void testCanConstruct_2() throws Exception {
        boolean actual = ConstructWordFromInputs.canConstruct(new String[]{"o", "j", "b", "k"}, "book");
        assertTrue(actual);
    }
}