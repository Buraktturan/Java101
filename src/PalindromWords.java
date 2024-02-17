public class PalindromWords {
    static boolean isPalindrom (String word){
        int i=0,j=word.length()-1;
        while (i<j){
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
                i++;
                j--;
        }
        return true;
    }

    static boolean isPalindrom2 (String word){
        String reverse = "";
        for (int i=word.length()-1;i>=0;i--){
            reverse += word.charAt(i);
            }
            if (reverse.equals(word)){
                return true;
            }else {
                return false;
            }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("kayak"));
    }
}
