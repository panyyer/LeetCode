public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxm = 0, cnt = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                cnt++;
                if(cnt > maxm) {
                    maxm = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        return maxm;
    }
}