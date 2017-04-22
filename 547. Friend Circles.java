public class Solution {
    /*
        简单并查集
    */
    public int findCircleNum(int[][] M) {
        int len = M.length;
        if(len == 0) return 0;
        int cnt = len;
        int []pre = new int[len];
        for(int i=0;i<len;i++) {
            pre[i] = i;
        }
        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++) {
                if(M[i][j]==1) {
                    int x = i, y = j;
                    while(pre[x]!=x) {
                        x = pre[x];
                    }
                    while(pre[y]!=y) {
                        y = pre[y];
                    }                
                    if(x!=y) {
                        cnt--;
                    }
                    pre[x] = y;
                    
                }
            }
        }
        return cnt;
    }
}