package leet.code;

import java.util.HashMap;
import java.util.Map;

public class XIII_RomeToArabic_01 {
    public static Map<Character, Integer> romanNum = new HashMap<>();

    static {
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
    }

    public static int convertRoman(String string){
        int result=0;
        char[] chars = string.toCharArray();
        for(int i=0; i<string.length(); i++){
            if (i<string.length()-1){
                if(romanNum.get(chars[i])>=romanNum.get(chars[i+1])){
                    result = result + romanNum.get(chars[i]);
                }
                else {
                    result=result+ romanNum.get(chars[i+1])-romanNum.get(chars[i]);
                    i++;
                }
            }
            else {
                result = result + romanNum.get(chars[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertRoman("XIX"));
    }
}

