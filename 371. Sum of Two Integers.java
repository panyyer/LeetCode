public class Solution {
    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        int digit;
        while(b!=0) {
            digit = a&b;       //a&b求出相同的位
            a = a^b;            //异或即不带进位的相加，第二次循环开始b就是代表进位，即加上进位，一直到没有进位的时候就完成了加法
            b = digit << 1;    //相同的位左移一位，代表加法中的进位
        }
        return a;
    }
}