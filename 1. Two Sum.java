public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []res = new int[2];
        Integer value;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            value = map.get(target-nums[i]);
            if(value!=null) {
                res[0] = value;
                res[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}