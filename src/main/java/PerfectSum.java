import java.util.*;

/**
 * Created by Mehari on 6/12/18.
 */
public class PerfectSum {
    public void printSubsets(int[] input, int sum){
        Map<Integer, List<Integer>> indexSum = new HashMap<Integer, List<Integer>>();
        SubSetSum subset = new SubSetSum();
        boolean[][] T = subset.getSubsetSumTable(input, sum);
        for(int i=0; i<input.length; i++){
            if(T[i][sum]){
                ArrayList<Integer> l = new ArrayList<Integer>();
                if(input[i]==sum){
                    l.add(input[i]);
                }else{
                    l.add(input[i]);
                    int r =i-1;
                    int temp=sum-input[i];
                    while (temp>=0 && r>=0){
                        if(r>=0 && temp>=0 && T[r][temp]){
                            if(input[r]<=temp){
                                l.add(input[r]);
                                temp=temp-input[r];
                            }
                            r--;
                        }
                    }
                }
                if(l.size()!=0) indexSum.put(i,l);
            }


        }

        for(Integer i : indexSum.keySet()){
            System.out.println(Arrays.toString(indexSum.get(i).toArray()));
        }
    }
}
