package leet.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class XIV_LongestCommonPrefix_01 {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < strs[0].length(); i++) {         //перебираем все символы первого слова
            int counter = 0;
            for (int j = 1; j < strs.length; j++) {          //перебираем все оставшиеся слова в наборе
                for (int k = 0; k < strs[j].length(); k++) { //перебираем каждый символ в каждом слове
                    if (strs[0].charAt(i) == strs[j].charAt(k)) {
                        counter++;
                        map.put(strs[0].charAt(i), counter);
//                        if (counter == strs.length - 1) {   //если символ есть во всех словах - добавляем
//                            result.append(strs[0].charAt(i));
//                        }
                    }
                }
            }
        }
        for (int i = 0; i < strs[0].length(); i++) {
            int currentCounter = map.get(strs[0].charAt(i));
//            int nextCounter = map.get(strs[0].charAt(i + 1));
//            int previousCounter = map.get(strs[0].charAt(i - 1));
            int expectedValue = strs.length - 1;

            if (i == 0 && //проверяем что первый и второй равны количеству слов в наборе
                    currentCounter == expectedValue &&
                    map.get(strs[0].charAt(i + 1)) == expectedValue) result.append(strs[0].charAt(i));
            else if (i == strs[0].length() - 1 && //проверяем что последний и предпоследний равны количеству слов
                    currentCounter == expectedValue &&
                    map.get(strs[0].charAt(i - 1)) == expectedValue) result.append(strs[0].charAt(i));
            else if (currentCounter == expectedValue && //проверяем что
                    map.get(strs[0].charAt(i + 1)) == expectedValue ||
                    map.get(strs[0].charAt(i - 1)) == expectedValue - 1) result.append(strs[0].charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String answer = XIV_LongestCommonPrefix_01.longestCommonPrefix(new String[]{"flower", "flow", "flight", "pofopol", "flu"});
        System.out.println(answer);
    }
}

//todo   надо приделать проверку на то что символы идут непрерывно, иначе работает неправильно
//например "flower", "flow", "flight", "pofopol", "flu" тоже выдает fl, хотя это явно не правильно