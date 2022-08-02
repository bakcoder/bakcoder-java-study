package algorithm.leetcode;

import java.util.Stack;

import main.java.algorithm.leetcode.common.ListNode;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
//		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//		ListNode l1 = new ListNode(0);
//		ListNode l2 = new ListNode(0);
		ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		
		
		ListNode result = new AddTwoNumbers().addTwoNumbersOnlyUsingListNode(l1, l2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
	
	public ListNode addTwoNumbersUsingStack(ListNode l1, ListNode l2) {
		ListNode result = null;
		Stack<Integer> stack = new Stack<>();
		
		while(l1 != null || l2 != null) {
			
			int val1 = 0;
			int val2 = 0;
			int carry = 0;
			
			if(l1 != null) {
				val1 = l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null) {
				val2 = l2.val;
				l2 = l2.next;
			}
			
			if(stack.isEmpty())
				stack.push((val1 + val2) % 10);
			else {
				carry = stack.pop();
				stack.push((carry + val1 + val2) % 10);
			}
			
			stack.push((carry + val1 + val2)/10);
		}
		
		if(stack.peek() == 0) stack.pop();
		
		while(!stack.isEmpty()) {
			if(result == null) result = new ListNode(stack.pop());
			else result = new ListNode(stack.pop(), result);
		}
		
		return result;
	}
	
	public ListNode addTwoNumbersOnlyUsingListNode(ListNode l1, ListNode l2) {
	    int carry = 0;
	    ListNode pointerNode, result = new ListNode(0);
	    pointerNode = result;
	    while (l1 != null || l2 != null || carry != 0) {
	        if (l1 != null) {
	            carry += l1.val;
	            l1 = l1.next;
	        }
	        if (l2 != null) {
	            carry += l2.val;
	            l2 = l2.next;
	        }
	        pointerNode.next = new ListNode(carry%10);
	        carry /= 10;
	        pointerNode = pointerNode.next;
	    }
	    return result.next;
	}
}

//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order, and each of their nodes contains a single digit.
//Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Example 1
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//
//Example 2
//Input: l1 = [0], l2 = [0]
//Output: [0]
//		
//Example 3
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

//Constraints
//The number of nodes in each linked list is in the range [1, 100].
//0 <= Node.val <= 9
//It is guaranteed that the list represents a number that does not have leading zeros.