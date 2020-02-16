package Leetcode.Easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	public static void main(String[] args) {

	}

}

class MyQueue {

	Stack<Integer> first = new Stack<>();
	Stack<Integer> second = new Stack<>();

	/** Initialize your data structure here. */
	public MyQueue() {

	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		if(second.size() > 0)
		{
			while(second.size() > 0)
			{
				first.push(second.pop());
			}
		}
		first.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		peek();
		return second.pop();
	}

	/** Get the front element. */
	public int peek() {
		if(second.isEmpty())
		{
			while(first.size() > 0)
			{
				second.push(first.pop());
			}
		}

		return second.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		if (first.isEmpty() && second.isEmpty())
			return true;
		else
			return false;
	}


	// Using single stack - You'll have to cheat using recursion
	Stack<Integer> stackQueue = new Stack<>();
	public void enqueue_single(int entry)
	{
		stackQueue.add(entry);
	}

	public void dequeue_single()
	{
		if (!stackQueue.isEmpty())
		{
			int popInt = stackQueue.pop();
			if (!stackQueue.isEmpty())
			{
				dequeue_single();
				stackQueue.push(popInt);
			}
		}
	}
}

