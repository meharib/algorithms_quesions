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
        List<Interval> result = new ArrayList<Interval>();
        intervals.sort((i1, i2) -> i1.start - i2.start);
        while(!intervals.isEmpty()){
            Interval current = intervals.remove(0);
            List<Interval> toBeMerged = new ArrayList<Interval>();
            for(Interval interval: intervals){
                if(isOverlapBothWay(current, interval)){
                    toBeMerged.add(interval);
                    current=merge(current,interval);
                }
            }
            for (Interval interval : toBeMerged) {
                intervals.remove(interval);
            }
            result.add(current);

        }
        return result;
    }

    private boolean isOverlapBothWay(Interval i, Interval j){
        return overlapsOneWay(i,j) || overlapsOneWay(j,i);
    }
    private boolean overlapsOneWay(Interval i, Interval j){
        return isBetween(i.start, j.start,j.end) || isBetween(i.end,j.start,j.end);
    }

    private boolean isBetween(int i, int j, int k){
        return j<=i && i<=k;
    }
    private Interval merge(Interval i, Interval j){
        return new Interval(Math.min(i.start, j.start), Math.max(i.end,j.end));
    }
}
