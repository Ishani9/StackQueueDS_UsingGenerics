package com.bl.assignment;

public class MyQueue {
	
	MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}
	
	/**
	 * UC 1
	 * 
	 * @param node
	 */
	@SuppressWarnings("rawtypes")
	public void enqueue(INode node) {
		myLinkedList.append(node);
	}
	
	@SuppressWarnings("rawtypes")
	public INode getHead() {
		return myLinkedList.getHead();
	}
	
	@SuppressWarnings("rawtypes")
	public INode getTail() {
		return myLinkedList.getTail();
	}
	
	/**
	 * UC 2
	 * 
	 * @param node
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public INode dequeue() {
		return myLinkedList.pop();
	}
	
	public void printQueue() {
		myLinkedList.printLinkList();
	}
	
}
