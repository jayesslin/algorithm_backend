package 剑指offer66;

import 剑指offer66.链表_合并两个有序链表.ListNode;

public class 链表_倒数第k个结点第二次 {
	public class ListNode {
	    int val;
	    ListNode next = null;
	    ListNode(int val) {
	        this.val = val;
	    }
	} 
	public ListNode FindKthToTail(ListNode head,int k) {
		 if (k<=0||head==null) return null;
	        ListNode fast = head;
	        ListNode slow = head;
			for (int i=1; i<k;i++) {
	        	if(fast.next==null) return null;
				fast= fast.next;
	        }
	        while(fast.next!=null) {
	        	fast= fast.next;
	        	slow=slow.next;
	        }
	        return slow;
	    }
}
