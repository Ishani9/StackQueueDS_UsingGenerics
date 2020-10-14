package com.bl.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	
	// UC 1
	@Test
	public void given3Numbers_whenQueued_shouldHaveFirstAsHead() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		System.out.println("Current queue is : ");
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, myQueue.getHead());
	}
	
	@Test
	public void given3Numbers_whenQueued_shouldHaveLastAsTail() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		Assert.assertEquals(myThirdNode, myQueue.getTail());
	}

	
	//UC 2
	@Test
	public void given3Numbers_whenDequeued_shouldReturnFirst() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		System.out.println("Current queue is : ");
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, myQueue.dequeue());
		System.out.println("Current queue after dequeue is : ");
		myQueue.printQueue();
		Assert.assertEquals(mySecondNode, myQueue.dequeue());
		System.out.println("Current queue after second dequeue is : ");
		myQueue.printQueue();
		Assert.assertEquals(myThirdNode, myQueue.dequeue());
		System.out.println("Current queue after third dequeue is : ");
		myQueue.printQueue();
	}


}
