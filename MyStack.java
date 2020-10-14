package com.bl.assignment;

public class MyStack {

	MyLinkedList myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList();
	}
	
	/**
	 * UC 1
	 * 
	 * @param node
	 */
	@SuppressWarnings("rawtypes")
	public void push(INode node) {
		myLinkedList.add(node);
	}
	
	@SuppressWarnings("rawtypes")
	public INode peek() {
		return myLinkedList.getHead();
	}
	
	public void printStack() {
		myLinkedList.printLinkList();
	}

}
