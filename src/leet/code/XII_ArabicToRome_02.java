package leet.code;

public class XII_ArabicToRome_02 {
    public static void toRoman(int number) {
        int[] romanValueArray = new int[]{1000,900, 500,400, 100,90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanCharArray = new String[]{"M","CM","D","C","CD", "L","XL", "X", "IX", "V","IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < romanValueArray.length; i++) {
            if (number == 0) {
                break;
            } else {
                while (number >= romanValueArray[i]) {
                    number = number - romanValueArray[i];
                    result.append(romanCharArray[i]);
                }
            }
        }
        System.out.println(result);
        String.valueOf(result);
    }

    public static void main(String[] args) {
        toRoman(14);
    }
}
