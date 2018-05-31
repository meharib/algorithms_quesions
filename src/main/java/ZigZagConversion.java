import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehari on 5/30/18.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int total =s.length();
        int numCols=0;
        while (total>0){
            total=total-numRows;
            numCols++;
                for (int i = 0; i < numRows - 2; i++) {
                    if(total>0){
                        total--;
                        numCols++;
                    }
                }
        }
        char[][] converted = new char[numRows][numCols];
        boolean fillLarge=true;
        int col=0;
        int row=0;

        for (int i = 0; i < s.length(); i++) {
            if(fillLarge){
                converted[row][col]=s.charAt(i);
                row++;
                if(row==numRows){
                    fillLarge=false;
                    col++;
                    row--;
                }
            }else{
                for (int j = 0; j < (numRows - 2); j++) {
                    row--;
                    if(i<s.length()) converted[row][col]=s.charAt(i);
                    i++;
                    col++;
                }
                i--;
                row--;
                fillLarge=true;

            }
        }

        //iterate over converted matrix
        StringBuffer result=new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if(converted[i][j]!=0){
                    result.append(converted[i][j]);
                }
            }
        }

        return result.toString();
    }
}
