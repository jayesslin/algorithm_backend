package 剑指offer66;

/*
 * head 维护新的链表  用root表示链表的头 最后root.next指向head这个新表
 */
public class 链表_合并两个有序链表 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
public ListNode Merge(ListNode list1,ListNode list2) {
	ListNode head=new ListNode(-1);
    head.next= null;
	ListNode root = head;
	while(list1!=null&&list2!= null) {
		if (list1.val <= list2.val) {
			head.next  = list1;
			head=list1;
			list1= list1.next;
		}else {
			head.next = list2;
			head = list2;
			list2= list2.next;
	 		}
		}
	if(list1!=null) {
		head.next = list1;
	}
	if(list2!=null) {
		head.next= list2 ;
	}
	return root.next;
}

}
