package com.bl.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	
	// UC 1
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
	
	//UC 2
	@Test
	public void given3Numbers_whenPopped_shouldRemoveLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		System.out.println("Current stack is : ");
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myStack.pop());
		System.out.println("Current stack after popping is : ");
		myStack.printStack();
	}
	
	@Test
	public void given3Numbers_whenPopped3times_shouldRemoveAll() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		System.out.println("Current stack is : ");
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myStack.pop());
		System.out.println("Current stack after popping is : ");
		myStack.printStack();
		Assert.assertEquals(mySecondNode, myStack.pop());
		System.out.println("Current stack after popping twice is : ");
		myStack.printStack();
		myStack.pop();
		System.out.println("Current stack after popping thrice is : ");
		myStack.printStack();
		
	}
	
}
