public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] arr = new int[Math.min(nums1.length,nums2.length)];
        int cnt = 0;
        for(int i : nums1) {
            set.add(i); 
        }
        for(int i : nums2) {
            if(set.contains(i)) {
                set2.add(i);
            }
        }        
        int[] res = new int[set2.size()];
        for(int i : set2) {
            res[cnt++] = i;
        }
        return res;
    }
}