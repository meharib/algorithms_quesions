package backtracking;

/**
 * Created by Mehari on 6/17/18.
 */
public class PrintAllSubSetsOfASet {

    public static void print(String[] input){
        for (int i = 0; i < input.length; i++) {
            subset("", i, input);
        }

    }

    private static void subset(String current, int i, String[] input) {
        String s = input[i];
        current =  current + "," + s;
        System.out.println(current);
        for (int j = i+1; j < input.length; j++) {
            subset(current,j,input);
        }
    }

    public static void main(String[] args){
        print(new String[]{"a", "b", "c"});
    }

}
