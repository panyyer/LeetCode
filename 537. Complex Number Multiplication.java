public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String []arr = a.split("\\+|i");
        String []arr2 = b.split("\\+|i");
        int real = Integer.parseInt(arr[0])*Integer.parseInt(arr2[0])+-1*Integer.parseInt(arr[1])*Integer.parseInt(arr2[1]);
        int image = Integer.parseInt(arr[0])*Integer.parseInt(arr2[1])+Integer.parseInt(arr[1])*Integer.parseInt(arr2[0]);
        return String.valueOf(real) + "+" + String.valueOf(image) + "i";
    }
}