package 二次练习;

public class 链表_反转_第二次 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	 public ListNode ReverseList(ListNode head) {
		 	if (head==null) return head;
		 	
		 	ListNode p = null ; 
		 	ListNode r ; 
		 	
		 	while(head != null) {
		 		r = head.next;
		 		head.next = p;
		 		p = head; 
		 		head = r;
		 	
		 	}
		 	return head;
	    }
}
