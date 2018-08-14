package miscellaneous;

/**
 * Created by Mehari on 8/13/18.
 */
public class NumbersToRoman {
    public static String intToRoman(int num) {
        /*
         - find the category of the number, start with the largest one and go down
         - determine how many times we apply the category
         - calculate the remainder and repeat until the remaineder is zero
        */
        String[] symbols = {"I", "IV", "V", "IX","X", "XL", "L", "XC", "C", "CD","D", "CM", "M"};
        int[] categories = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder roman = new StringBuilder();
        while(num>0){
            int index = getSymbolIndex(num, categories);
            String symbol = symbols[index];
            int count = num/categories[index];
            for(int i=0; i<count; i++){
                roman.append(symbol);
            }
            num=num-(categories[index]*count);
        }
        return roman.toString();
    }

    private static int getSymbolIndex(int num, int[] categories){
        for(int i=categories.length-1; i>=0;i--){
            if(num>= categories[i]){
                return i;
            }
        }
        return -1;
    }
}
