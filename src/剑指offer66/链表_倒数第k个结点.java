package 剑指offer66;

public class 链表_倒数第k个结点 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode FindKthToTail(ListNode head,int k) {
      //注意边界条件
	   if (k<=0||head==null) return null;
       ListNode x= head;
       ListNode y= head;
       int i ;
       //数学关系
       for(i = 1;i < k ; i++) {
			if(x.next!= null){
               x = x.next;
           }else {
               return null;
           }
       }
       while(x.next!=null) {
       	x = x.next;
       	y=y.next;
       }
       return y;
   }
}
