package dsa.lovebabbar.week4;

import java.util.Arrays;

public class ReplaceSpaces {
    //Date- 25Feb | Week4 day2 | Q3
    public static void main(String[] args) {
        String sentence = "My name is Sandeep";
        replaceSpaces(sentence);
    }

    private static void replaceSpaces(String sentence) {
        char[] chars = sentence.toCharArray();
        for(int i=0;i< chars.length-1;i++){
            if(chars[i] == 32){
                chars[i] = '@';
            }
        }
       // Arrays.stream(chars)
    }
}
