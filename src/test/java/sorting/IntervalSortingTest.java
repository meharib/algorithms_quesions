package sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/5/18.
 */
public class IntervalSortingTest {

    @Test
    public void testMerge_1() throws Exception {
        IntervalSorting intervalSorting = new IntervalSorting();
        ArrayList<IntervalSorting.Interval> input = new ArrayList<IntervalSorting.Interval>();
        input.add(intervalSorting.new Interval(1, 3));
        input.add(intervalSorting.new Interval(2, 6));
        input.add(intervalSorting.new Interval(8, 10));
        input.add(intervalSorting.new Interval(15, 18));
        List<IntervalSorting.Interval> actual = intervalSorting.merge(input);
        for (IntervalSorting.Interval interval : actual) {
            System.out.println(interval.toString());
        }

    }

    @Test
    public void testMerge_2() throws Exception {
        IntervalSorting intervalSorting = new IntervalSorting();
        ArrayList<IntervalSorting.Interval> input = new ArrayList<IntervalSorting.Interval>();
        input.add(intervalSorting.new Interval(0, 1));
        input.add(intervalSorting.new Interval(1, 4));
        input.add(intervalSorting.new Interval(4, 5));
        List<IntervalSorting.Interval> actual = intervalSorting.merge(input);
        for (IntervalSorting.Interval interval : actual) {
            System.out.println(interval.toString());
        }

    }

    @Test
    public void testMerge_3() throws Exception {
        IntervalSorting intervalSorting = new IntervalSorting();
        ArrayList<IntervalSorting.Interval> input = new ArrayList<IntervalSorting.Interval>();
        input.add(intervalSorting.new Interval(2, 3));
        input.add(intervalSorting.new Interval(4, 5));
        input.add(intervalSorting.new Interval(6, 7));
        input.add(intervalSorting.new Interval(8, 9));
        input.add(intervalSorting.new Interval(1, 10));
        List<IntervalSorting.Interval> actual = intervalSorting.merge(input);
        for (IntervalSorting.Interval interval : actual) {
            System.out.println(interval.toString());
        }

    }

}