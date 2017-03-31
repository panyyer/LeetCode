public class Solution {
    public int minMoves2(int[] nums) {
        int middle = nums.length/2;
        Arrays.sort(nums);
        int res = 0;
        for(int i : nums) {
            res+=Math.abs(i-nums[middle]);
        }
        return res;
    }
}