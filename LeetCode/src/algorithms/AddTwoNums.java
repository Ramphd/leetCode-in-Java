package algorithms;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

public class AddTwoNums {
	public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode list1 = l1;
		ListNode list2 = l2;
		ListNode tempCur = head;
		int quotient = 0;//ил
		while(list1!=null || list2!=null){
			int x = (list1!=null) ? list1.val : 0;
			int y = (list2!=null) ? list2.val : 0;
			int sum = quotient + x + y ;
			quotient = sum / 10;
			tempCur.next = new ListNode(sum % 10);
			tempCur = tempCur.next;
			if(list1 != null) list1 = list1.next;
			if(list2 != null) list2 = list2.next;
		}
	    if(quotient > 0)
	    	tempCur.next = new ListNode(quotient);
	
	return head.next;    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
