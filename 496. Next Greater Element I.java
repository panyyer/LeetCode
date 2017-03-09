public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] maxm = new int[nums.length];
        int[] res = new int[findNums.length];
        ArrayList<Integer> list = new ArrayList<Integer>(1005);
        int index;
        if(nums.length > 0) {
        	list.add(nums[nums.length-1]);
            maxm[nums.length-1] = nums[nums.length-1];

        }
        for(int i=nums.length-2;i>-1;i--) {  //记i以后的数组的最大值
        	list.add(nums[i]);
            if(nums[i]<maxm[i+1]) {
                maxm[i] = maxm[i+1];
            } else {
                maxm[i] = nums[i];
            }
        }

        for(int i=findNums.length-1;i>-1;i--) {
            index = nums.length - 1 - list.indexOf(findNums[i]);
            if(maxm[index] <= findNums[i]) {
                res[i] = -1;
            } else {
                for(int j=index+1;j<nums.length;j++) {
                    if(nums[j]>findNums[i]) {
                        res[i] = nums[j];
                        break;
                    }
                }
            }
        }
        return res;
        
    }
}