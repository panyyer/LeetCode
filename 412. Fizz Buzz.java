public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i=1;i<=n;i++) {
            if(i%3!=0 && i%5!=0) {
                list.add(String.valueOf(i));
            } else if(i%3==0) {
                if(i%5==0) {
                    list.add("FizzBuzz");
                } else {
                    list.add("Fizz");
                }
            } else {
                list.add("Buzz");
            }
        }
        return list;
    }
}