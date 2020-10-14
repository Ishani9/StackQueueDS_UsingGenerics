package com.bl.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void given3Numbers_whenPushed_shouldHaveLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		System.out.println("Current stack is : ");
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myStack.peek());
	}
	
}
