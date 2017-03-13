public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
		int[] B = new int[A.length];
		int flag,cnt=0,res=0,n,i,num=0;
        for(i=0;i<A.length-1;i++) {
            flag = A[i+1]-A[i];
            cnt = 2;
            for(i++;i<A.length-1;i++) {
                if(A[i+1]-A[i] == flag) {
                    cnt++;
                } else {
                    i--;
                    break;
                }
            }
            if(cnt>2) {
                B[num++] = cnt;         
            }
        }
        for(i=0;i<num;i++) {
            res+=(B[i]-2)*(B[i]-1)/2;
        }
        return res;
    }
}
