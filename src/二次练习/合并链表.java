package 二次练习;

public class 合并链表 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	 public ListNode Merge(ListNode list1,ListNode list2) {
	        if (list1 == null) {
	        	return list2; 
	        }else if(list2 ==null) {
	        	return list1;
	        }
	        ListNode  res = new ListNode(-1);
	        if(list1!=null && list2 !=null) {
	        	if(list1.val<list2.val) {
	        		res.next = list1; 
	        		list1 = list1.next;
	        		res = res.next;
	        	}else {
	        		res.next = list2;
	        		list2 = list2.next;
	        		res = res.next;
	        	}
	        }
	        if(list1!= null) {
	        	 res.next = list1;
	        }
	        if(list2!= null) {
	        	 res.next = list2;
	        }
	        return res;
	    }
}
