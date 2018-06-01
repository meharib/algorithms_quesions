import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehari on 5/30/18.
 */
public class ReverseInteger {

    public int reverse(int x){
        int sign=x<0?-1:1;
        x= Math.abs(x);
        int digits = String.valueOf(x).length();
        double result=0.0;
        for (int i = digits-1; i >=0; i--) {
            result+=(x%10) * Math.pow(10,i);
            x=x/10;
        }
        if(result!=(int)result) return 0;
        return sign*(int) result;
    }

}
