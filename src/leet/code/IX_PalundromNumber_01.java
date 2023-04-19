package leet.code;

public class IX_PalundromNumber_01 {
    public boolean isPalindrome(int x) {
        boolean isPali=false;

        Integer i = x;
        StringBuilder stringViewOfInt = new StringBuilder(i.toString());
        StringBuilder reversedVersionOfString = new StringBuilder(i.toString()).reverse();
        if (stringViewOfInt.toString().equals(reversedVersionOfString.toString())){
            isPali=true;
        }
        return isPali;
    }

    public static void main(String[] args) {
        IX_PalundromNumber_01 second = new IX_PalundromNumber_01();

        System.out.println(second.isPalindrome(10));
    }
}
