public class Solution {
    public String reverseString(String s) {
        int len = s.length();
        char[] res = new char[len];
        for(int i=0,j=len-1;i<len;i++,j--) {
            res[i] = s.charAt(j);
        }
        return String.valueOf(res);
    }
}