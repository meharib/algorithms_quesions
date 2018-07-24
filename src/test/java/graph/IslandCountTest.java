package graph;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/23/18.
 */
public class IslandCountTest {

    @Test
    public void testGetNumberOfIslands() throws Exception {
        int[][] arr = { {0,   1,    0,    1,    0},
                {0,    0,    1,    1,    1},
                {1,    0,    0,    1,    0},
                {0,    1,    1,    0,    0},
                {1,    0,    1,    0,    1} };
        assertEquals(6, IslandCount.getNumberOfIslands(arr));
    }
}