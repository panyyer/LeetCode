public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int cnt = 0, num = 0;
        for(int i : nums) {
            num^=i; //可知循环的最终结果为a^b，其中a 和 b 是结果
        }
        num &= -num;  //找出num中左起第一个为1的位置，根据a和b在这一位上的不同，区分出两个数
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