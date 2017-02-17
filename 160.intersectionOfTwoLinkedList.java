//Answer
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }
    
    return a;
}

//my solution
public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	ListNode a = headA;
	ListNode b = headB;
	ListNode currentA = headA;
	ListNode currentB = headB;
	
	if(a == null && b == null){
		return null;
    }
    
    while(currentA != null){
    	while(currentB != null){
    	    if(currentA == currentB){
    	       return currentA;
            }else{
            	currentB = currentB.next;
            }
        }
        currentA = currentA.next;
    }
}