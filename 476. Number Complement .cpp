class Solution {
public:
    int findComplement(int num) {
        int power=0,t=0;
        while(num) {
            if(num%2==0) {
                t|=(1<<power);
            }
            power++;
            num>>=1;
        }
        return t;
    }
};
