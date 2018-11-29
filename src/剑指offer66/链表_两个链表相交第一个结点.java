package 剑指offer66;

import java.util.HashMap;

public class 链表_两个链表相交第一个结点 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	/*
	 * 用hash map
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 HashMap<ListNode, Integer> res = new HashMap<ListNode, Integer>();
		 
		 while(pHead1!=null) {
			 res.put(pHead1, null);
			 pHead1 = pHead1.next;
		 }
		 while(pHead2!=null) {
			 if(res.containsKey(pHead2)) {
				 return pHead2;
			 }
			 pHead2=pHead2.next;
		 }
		 return null;
    }
}
