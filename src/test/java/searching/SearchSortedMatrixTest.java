package searching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/6/18.
 */
public class SearchSortedMatrixTest {

    @Test
    public void testSearch() throws Exception {
        int[][] input = { {1, 5, 9},
                {14, 20, 20},
                {30, 34, 43} };
        assertTrue(SearchSortedMatrix.search(20,input));
        assertFalse(SearchSortedMatrix.search(2,input));
        assertTrue(SearchSortedMatrix.search(43,input));
    }
}