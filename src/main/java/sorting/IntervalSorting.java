package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehari on 7/5/18.
 */
public class IntervalSorting {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
        public String toString(){
            return String.format("[%s, %s]",start,end);
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if(intervals==null || intervals.size()<=1){
            return intervals;
        }
        List<Interval> result = new ArrayList<Interval>();
        intervals.sort((i1, i2) -> i1.start - i2.start);

        Interval current = intervals.remove(0);
        while(!intervals.isEmpty()){
            if(isDisjoint(current, intervals.get(0))){
                result.add(current);
                current=intervals.remove(0);
            }else{
                current = merge(current,intervals.remove(0));
            }
        }
        result.add(current);
        return result;
    }


    private Interval merge(Interval i, Interval j){
        i.start = Math.min(i.start, j.start);
        i.end = Math.max(i.end, j.end);
        return i;
    }

    private boolean isDisjoint(Interval i1, Interval i2){
        return i1.end < i2.start;
    }
}
