public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []arr = new int[2*nums.length];
        int []res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }
        int now,len = 2*nums.length;
        for(int i=0;i<nums.length;i++) {
            now = nums[i];
            res[i] = -1;
            for(int j=i+1;j<len;j++) {
                if(now<arr[j]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
}