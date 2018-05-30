/**
 * Created by Mehari on 5/30/18.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s==null) return s;
        int l = s.length();
        int[][] T = new int[l][l];
        //base case 1) if i=j T[i][j]=1 if i>j T[i][j]=0

        for (int j = 0; j < l; j++) {
            for (int i = 0; i<l; i++) {
                if(i==j)T[i][j]=1;
                if(i>j)T[i][j]=0;
            }
        }
        int max=0;
        int start=0;
        int end=0;
        for (int j = 1; j < l; j++) {
            for (int i = 0; i < j; i++) {
               if(s.charAt(i)==s.charAt(j) && T[i+1][j-1]!=-1){
                   T[i][j]=T[i+1][j-1] + 2;
                   if (T[i][j] > max){
                       max=T[i][j];
                       start=i; end=j;
                   }
               }else{
                   T[i][j]=-1;
               }
            }
        }
        return s.substring(start,end+1);

    }
}
