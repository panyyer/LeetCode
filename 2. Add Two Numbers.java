/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // if(l1 return null;
        int len1 = 1, len2 = 1, i , j, tlen;
        int []arr = new int[129];
        int []arr1 = new int[129];
        int []arr2 = new int[129];
        while(l1!=null) {
            arr1[len1++] = l1.val;
            l1 = l1.next;
        }
        while(l2!=null) {
            arr2[len2++] = l2.val;
            l2 = l2.next;            
        }
        ListNode root, temp;
        if(len1 < len2) {
            arr = arr1;
            arr1 = arr2;
            arr2 = arr;
            
            tlen = len1;
            len1 = len2;
            len2 = tlen;
        }
        root = new ListNode((arr1[1] + arr2[1]) % 10);
        arr1[2] += (arr1[1] + arr2[1])/10;
        temp = root;
        for(i=2,j=2;i<len1 && j<len2;i++,j++) {
            temp.next = new ListNode((arr1[i] + arr2[j]) % 10);
            arr1[i+1] += (arr1[i] + arr2[j])/10;
            temp = temp.next;
        }
        while(i<len1) {
            temp.next = new ListNode(arr1[i] % 10);
            temp = temp.next;
            arr1[i+1] += arr1[i]/10;
            i++;
        }
        if(arr1[i] > 0) {
             temp.next = new ListNode(arr1[i]);
        }
        return root;
    }
}