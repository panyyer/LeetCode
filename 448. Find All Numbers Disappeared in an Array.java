public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums.length==0) return list;
        int val;
        for(int i=0;i<nums.length;i++) {
            val = Math.abs(nums[i])-1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                list.add(i+1);
            }
        }
        return list;
    }
}
