public class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int[] ch = new int[128];
        int maxm = 0;
        for(int i=0;i<s.length();i++) {
            ch[s.charAt(i)]++;
            maxm = Math.max(maxm,ch[s.charAt(i)]);
        }
        String[] bucket = new String[maxm+1];
        for(int i=0;i<128;i++) {
            if(ch[i]!=0) {
                String str = bucket[ch[i]];
                bucket[ch[i]] = str==null ? ""+(char)i : str+(char)i;                
            }
        }
        for(int i=maxm;i>-1;i--) {
        	if(bucket[i]!=null) {
                for(char c : bucket[i].toCharArray()) {
                    for(int j=0;j<i;j++) {
                        sb.append(c);
                    }
                }        		
        	}
        }
        return sb.toString();
        
    }
}