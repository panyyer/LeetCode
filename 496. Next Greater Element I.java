public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] maxm = new int[nums.length];
        int[] res = new int[findNums.length];
        ArrayList<int[]> list = new ArrayList<int[]>(Arrays.asList(nums));

        int index;
        if(nums.length > 0) {
            maxm[nums.length-1] = nums[nums.length-1];
        }        
        for(int i=nums.length-2;i>-1;i--) {  //记i以后的数组的最大值
            if(nums[i]<maxm[i+1]) {
                maxm[i] = maxm[i+1];
            } else {
                maxm[i] = nums[i];
            }
        }
        for(int i=findNums.length-1;i>-1;i--) {
            index = 0;
        	for(int k=0;k<nums.length;k++) {
        		if(nums[k]==findNums[i]) {
        			index = k;
        			break;
        		}
        	}
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