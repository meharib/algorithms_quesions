package binarysearch;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/12/18.
 */
public class FindMinInRotatedArrayWithDupsTest {

    @Test
    public void test(){
        int[] nums = {1,3,3,0,0,0};
        assertEquals(0,FindMinInRotatedArrayWithDups.findMin(nums));

    }
}