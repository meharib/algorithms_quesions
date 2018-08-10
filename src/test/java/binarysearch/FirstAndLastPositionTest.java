package binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/9/18.
 */
public class FirstAndLastPositionTest {

    @Test
    public void testSearchRange() throws Exception {
        int[] arr = {5,7,7,8,8,10};
        int[] expected = {3,4};
        assertArrayEquals(expected,FirstAndLastPosition.searchRange(arr,8));

    }
}