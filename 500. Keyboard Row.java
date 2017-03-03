public class Solution {
    public String[] findWords(String[] words) {
        String[] str = {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        int i;
        ArrayList<String> l = new ArrayList<String>();
        for(String word : words) {
        	char[] t = word.toCharArray();
            for(String s : str){
            	for(i=0;i<t.length;i++) {
            		if(s.indexOf(t[i]) == -1) {
            			break;
            		}
            	}
                if(i==t.length) {
                    l.add(word);
                }
            }
        }
        String[] t = l.toArray( new String[l.size()]);
		return t;
    }
}