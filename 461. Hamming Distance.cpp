class Solution {
public:
    int hammingDistance(int x, int y) {
        int t = x^y,sum = 0;
        while(t) {
            if(t&1) {
                sum++;
            }
            t>>=1;
        }
        return sum;
    }
};
