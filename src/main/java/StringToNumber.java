/**
 * Created by Mehari on 5/31/18.
 */
public class StringToNumber {
    public int myAtoi(String str) {
        if(str==null) return 0;
        str=str.trim();
        if(str.isEmpty()) return 0;
        boolean hasSign = (str.charAt(0)=='+' || str.charAt(0)=='-');
        boolean isNumber=false;
        if(hasSign && str.length()>1 && Character.isDigit(str.charAt(1))) isNumber=true;
        if(!hasSign && Character.isDigit(str.charAt(0))) isNumber=true;
        int i=0;
        if(isNumber){
            if(hasSign) i++;
            while (i < str.length() && Character.isDigit(str.charAt(i))){
                i++;
            }
            Double d = Double.valueOf(str.substring(0, i));
            if(d>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(d<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return d.intValue();

        }else{
            return 0;
        }
    }
}
