/**
 * Created by Mehari on 6/2/18.
 */
public class PalindromicInteger {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x/10==0) return true;
        double inverse=0;
        int temp=x;
        while (temp>0) {
            inverse=(inverse*10) + temp%10;
            temp=temp/10;
        }
        return inverse==x;
    }
}
