public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
	    List<Integer> list = new ArrayList<Integer>();
	        int val;
	        for(int i=0;i<nums.length;i++) {
	            val = Math.abs(nums[i])-1;
	            if(nums[val]<0) {
	                list.add(val+1);
	            }
	            nums[val] = -nums[val];
	            
	        }
	        return list;
    }
}