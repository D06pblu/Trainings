package leet.code;

public class IX_PalindromString_01 {
    public boolean isPalindrome(String text) {
        String withoutSpacesAndSybmols = text.toLowerCase().replaceAll("[^a-zA-Z0-9)]","");
        StringBuilder reversed = new StringBuilder(withoutSpacesAndSybmols).reverse();
        return withoutSpacesAndSybmols.equals(reversed.toString());
    }

    public static void main(String[] args) {
        IX_PalindromString_01 second = new IX_PalindromString_01();

        System.out.println(second.isPalindrome("Q12 32 1q"));
    }
}
