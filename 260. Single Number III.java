public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int cnt = 0, num = 0;
        for(int i : nums) {
            num^=i; //��֪ѭ�������ս��Ϊa^b������a �� b �ǽ��
        }
        num &= -num;  //�ҳ�num�������һ��Ϊ1��λ�ã�����a��b����һλ�ϵĲ�ͬ�����ֳ�������
        for(int i : nums) {
            if((num&i)==0) {
                res[0]^=i;
            } else {
                res[1]^=i;
            }
        }
        return res;
    }
}