public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0) return 0;
        int res = 0, now = 0;
        now = timeSeries[0];
        for(int i=1;i<timeSeries.length;i++) {
            res += timeSeries[i]-now > duration ? duration : timeSeries[i]-now;
            now = timeSeries[i];
        }
        return res+duration;
    }
}