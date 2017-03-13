public class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if(len == 1) return true;
        int first = 0, second = 0, i;
        if(word.charAt(0) <= 'Z') {
            first = 1;
        }
        if(word.charAt(1) <= 'Z') {
            second = 1;
            for(i=2;i<len;i++) {
                if(word.charAt(i) > 'Z') {
                    break;
                }            
            }
        } else {
           for(i=2;i<len;i++) {
                if(word.charAt(i) < 'a') {
                    break;
                }            
            }               
        }
        if(i!=len || (first==0 && second==1)) {
            return false;
        }
        return true;
    }
}