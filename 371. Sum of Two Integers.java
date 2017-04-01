public class Solution {
    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        int digit;
        while(b!=0) {
            digit = a&b;       //a&b求出相同的位
            a = a^b;           //异或，对应位不同的相加，相同的置0，因为进1后为0
            b = digit << 1;    //相同的位左移一位，代表加法中的进位
        }
        return a;
    }
}