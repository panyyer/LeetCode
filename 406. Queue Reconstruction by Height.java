public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people.length==0) return new int[0][2];
        class People implements Comparable<People> {
				public int h,k;	
				public People(int h, int k) {
					this.h = h;
					this.k = k;
				}
				public People(){}
				@Override
				public int compareTo(People o) {
					if(this.h<o.h) {
						return 1;
					} else if(this.h>o.h) {
						return -1;
					} else {
						if(this.k<o.k) {
							return -1;
						} else {
							return 1;
						}
					}
				}
		}
		List<People> hash = new ArrayList<People>();
		for(int i=0;i<people.length;i++) {
			hash.add(new People(people[i][0],people[i][1]));
		}
		Collections.sort(hash);
		Iterator it = hash.iterator();
		int[][] res = new int[people.length][people[0].length];
		People temp = new People();
		int i = hash.size()-1,j;
		while(it.hasNext()) {
			temp = (People)it.next();
			if(temp.k>0) {
				for(j=i;j<i+temp.k;j++) {
					res[j][0] = res[j+1][0];
					res[j][1] = res[j+1][1];
				}
			}
			res[i+temp.k][0] = temp.h;
			res[i+temp.k][1] = temp.k;
			i--;
		}
		return res;
    }
}