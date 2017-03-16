public class Solution {
    int[] res = new int[16];
    boolean[] vis = new boolean[16];
    int cnt = 0;
    public void backTrace(int pos, int N) {
        if(pos==0) {
            cnt++;
            return;
        }
        for(int i=1;i<=N;i++) {
            if(vis[i]==true || (pos%i!=0 && i%pos!=0)) {
                continue;
            }
            vis[i] = true;
            backTrace(pos-1, N);
            vis[i] = false;
        }
    }
    
    public int countArrangement(int N) {
        backTrace(N,N);
        return cnt;
    }
}