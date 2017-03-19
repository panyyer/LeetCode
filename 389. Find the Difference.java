public class Solution {
    public char findTheDifference(String s, String t) {
        char c = t.charAt(0);
        int len = s.length();
        for(int i=0;i<len;i++) {
            c^=s.charAt(i);
            c^=t.charAt(i+1);
        }
        return c;
    }
}