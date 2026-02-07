package Truncate_Sentence;

import java.util.*;

class TruncateSentence {

    public String truncateSentence(String s, int k) {
        String res = "";
        int c = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                c += 1;
                if(c == k) {
                    break;
                }
            }
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        TruncateSentence obj = new TruncateSentence();
        System.out.println(obj.truncateSentence("Hello how are you Contestant", 4));
        // Output: Hello how are you
    }
}