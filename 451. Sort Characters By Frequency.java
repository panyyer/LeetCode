public class Solution {
    public String frequencySort(String s) {
        TreeMap<Integer, Character> map = new TreeMap<>(new Comparator<Integer>(){
        	public int compare(Integer o1, Integer o2) {
        		if(o1<o2) return 1;
        		else return -1;
        	}
        });        
        HashMap<Character, Integer> hash = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(hash.containsKey(c)) {
                hash.put(c,hash.get(c)+1);
            } else {
                hash.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> e: hash.entrySet()) {
            map.put(e.getValue(),e.getKey());
        }
        for(Map.Entry<Integer, Character> e: map.entrySet()) {
            for(int i=0;i<e.getKey();i++) {
                sb.append(e.getValue());
            }
        }        
        return sb.toString();
        
    }
}