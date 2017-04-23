public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if(nums.length==0) return null;
        String[] res = new String[nums.length];
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        String[] rank = new String[nums.length+1];
        rank[1] = "Gold Medal";
        if(nums.length>1) {
            rank[2] = "Silver Medal";
        }
        if(nums.length>2) {
            rank[3] = "Bronze Medal";
        }
        for(int i=4;i<=nums.length;i++) {
            rank[i] = String.valueOf(i);
        }
        int index = nums.length;
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            res[e.getValue()] = rank[index];
            index--;
        }
        return res;
    }
}