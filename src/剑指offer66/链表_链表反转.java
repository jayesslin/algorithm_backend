package 剑指offer66;

public class 链表_链表反转 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	} 
	/*
	 * 三个指针不停维护一个自反转链表
	 */
	public ListNode ReverseList(ListNode head) {
		ListNode next ,pre;
		pre = null;
		if (head == null)
            return head;
		while (head!=null) {
			next = head .next;
			head.next = pre;
			pre = head; 
			head = next ; 
		}
		return pre;
	        
	    }
}
