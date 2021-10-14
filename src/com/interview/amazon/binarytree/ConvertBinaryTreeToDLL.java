package com.interview.amazon.binarytree;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ConvertBinaryTreeToDLL 
{
	public static void main(String ...args)
	{
		Node node = Node.createBinaryTree(1, 7);
		node.getOutput(node);
		System.out.println(getDLLFromBinaryTree(node));
	}
	static LinkedList<Node> getDLLFromBinaryTree(Node node)
	{
		ArrayDeque<Node> queue = new ArrayDeque<Node>();
		convertBinaryTreeToArray(node,queue);
		System.out.println("list after creating queue\n"+queue);
		 return convertQueueToDLL(queue);
	}
	static LinkedList<Node> convertQueueToDLL(ArrayDeque<Node> queue)
	{
		Node lastNode = null;
		LinkedList<Node> result =new LinkedList<Node>();
		while(!queue.isEmpty())
		{
			Node currentNode = queue.pop();
			Node nextNode = queue.peek();
			currentNode.leftNode=lastNode;
			currentNode.rightNode=nextNode;
			result.add(currentNode);
			lastNode = currentNode;
		}
		return result;
	}
	static void convertBinaryTreeToArray(Node node,ArrayDeque<Node> nodeList)
	{
		if(node== null)
		{
			return;
		}
		convertBinaryTreeToArray(node.leftNode,nodeList);
		nodeList.push(node);
		convertBinaryTreeToArray(node.rightNode,nodeList);
	}
	
}
