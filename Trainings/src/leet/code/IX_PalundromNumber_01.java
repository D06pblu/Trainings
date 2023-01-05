package leet.code;

public class IX_PalundromNumber_01 {
    public boolean isPalindrome(int x) {
        boolean isPoli=false;

        Integer i = new Integer(x);
        StringBuilder stringBuilder = new StringBuilder(i.toString());
        StringBuilder stringBuilderReverse = new StringBuilder(i.toString()).reverse();
        if (stringBuilder.toString().equals(stringBuilderReverse.toString())){
            isPoli=true;
        }

        return isPoli;
    }

    public static void main(String[] args) {
        IX_PalundromNumber_01 second = new IX_PalundromNumber_01();

        System.out.println(second.isPalindrome(10));
    }
}
