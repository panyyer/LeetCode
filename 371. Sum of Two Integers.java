public class Solution {
    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        int digit;
        while(b!=0) {
            digit = a&b;       //a&b�����ͬ��λ
            a = a^b;           //��򣬶�Ӧλ��ͬ����ӣ���ͬ����0����Ϊ��1��Ϊ0
            b = digit << 1;    //��ͬ��λ����һλ������ӷ��еĽ�λ
        }
        return a;
    }
}