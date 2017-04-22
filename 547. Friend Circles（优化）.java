public class Solution {
    /*
        �򵥲��鼯
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
                    int x = i, y = j, temp, p;
                    while(pre[x]!=x) {
                        x = pre[x];
                    }
                    p = i;
                    while(pre[p]!=x) {   //�Ż����������̸��Ĳ��ҳ���
                        temp = pre[p];
                        pre[p] = x;
                        p = temp;
                    }
                    while(pre[y]!=y) {
                        y = pre[y];
                    }  
                    p = j;
                    while(pre[p]!=y) {   //�Ż����������̸��Ĳ��ҳ���
                        temp = pre[p];
                        pre[p] = y;
                        p = temp;
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