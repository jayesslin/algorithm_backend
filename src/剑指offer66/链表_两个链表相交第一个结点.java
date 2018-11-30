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
	/*
	 * 遍历两个链表 ，  短的结束  换成长的  ， 长的结束 换成短的
	 * 或者两个同时达到 NULL
	 */
	public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
		ListNode l1 = pHead1;
		ListNode l2 = pHead2;
		while(l1 != l2) {
			l1 = (l1 == null? pHead2: l1.next);
			l2 = (l2 == null? pHead1: l1.next);
		}
		return l1;
	}
}
