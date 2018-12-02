package 剑指offer66;

public class 链表_环入口的第一个结点 {
	 public class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode p1 = pHead; 
        ListNode p2 = pHead;
        while(p2 != null && p2.next != null ){
        	p1 = p1.next.next;
        	p2 = p2.next;
        	if(p1==p2) {
        		//进入说明有环
        		p1 = pHead;
        		while(p1!=p2) {
        			p1=p1.next;
        			p2=p2.next;
        		}
        		if(p1==p2) return p1;
        	}
        }return null;
    }
}
