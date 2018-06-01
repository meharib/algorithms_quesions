/**
 * Created by Mehari on 5/31/18.
 */
public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        //find the longest palindrome that starts at i;
        int i=0; int j= s.length()-1;
        int k=s.length()-1;
        while (i<=j){
           if(s.charAt(i)==s.charAt(j)){
               i++;
               j--;
           }else{
               i=0;k--;j=k;
           }
        }
        System.out.println("found palindrome: " + s.substring(0,k+1));
        //reverse the strings that are to the right of the longest palindrome and append them to the front of the left over string
        if(k<s.length()-1){
            StringBuffer result = new StringBuffer(s.substring(k+1, s.length()));
            result= result.reverse();
            result.append(s);
            return result.toString();
        }
        return s;

    }

}
