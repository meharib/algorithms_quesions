package backtracking;

/**
 * Created by Mehari on 6/18/18.
 */
public class ConstructWordFromInputs {

    public static boolean canConstruct(String[] input, String word){
        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            if(word.startsWith(current)){
                String remaining= word.substring(current.length());
                if(remaining.length()==0) return true;
                if(canConstruct(input,remaining)) return true;
            }
        }
        return false;
    }


}
