package searching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/15/18.
 */
public class FindDuplicatesTest {

    @Test
    public void testFindDuplicates() throws Exception {
        int[] arr1 = {1,2,3,5,6,7};
        int [] arr2 = {3,6,7,8,20};
        int[] expected = {3,6,7};
        assertArrayEquals(expected, FindDuplicates.findDuplicates(arr1,arr2));
    }
}