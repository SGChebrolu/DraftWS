package dsa.lovebabbar.week4;

public class PalindromeCheck {
    public static void main(String[] args) {
        String word = "RACECA";
        System.out.println(execute(word));
    }

    private static boolean execute(String word) {
        char[] chars = word.toCharArray();
        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(chars[i] != chars[j]){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
}
