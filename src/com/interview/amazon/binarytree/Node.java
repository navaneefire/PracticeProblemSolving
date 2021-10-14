package com.interview.amazon.binarytree;

import java.util.ArrayDeque;





public class Node 
{
	public int value;
	public Node leftNode;
	public Node rightNode;
	
	public static void getOutput(Node node)
	{
		ArrayDeque<Node> nodeQueue = new ArrayDeque<Node>();
		nodeQueue.add(node);		
		int level=1;
		int queueLength=1;
		while(nodeQueue.size()>0)
		{	
			System.out.print("level"+level+ "=======> ");			
			for(int i=0;i<queueLength;i++)
			{
				Node currentNode  = nodeQueue.poll();
				System.out.print(currentNode.value);
				if(currentNode.leftNode!=null)
				{
					nodeQueue.offer(currentNode.leftNode);					
				}				
				if(currentNode.rightNode!=null)
				{	
					nodeQueue.offer(currentNode.rightNode);					
				}				
				System.out.print("   ");
			}
			System.out.println();
			queueLength = nodeQueue.size();
			level++;
		}
	}
	public static Node createBinaryTree(int startIndex,int endIndex)
	{
		if(startIndex > endIndex)
		{
			return null;
		}
		else if(startIndex == endIndex)
		{
			Node node = new Node();
			int mid = (startIndex+endIndex)/2;
			node.value=mid;
			node.leftNode=null;
			node.rightNode=null;
			return node;
		}
		else
		{
			Node node =new Node();
			int mid = (startIndex+endIndex)/2;
			Node leftNode = createBinaryTree(startIndex, mid-1);
			Node rightNode = createBinaryTree(mid+1,endIndex);
			node.value=mid;
			node.leftNode=leftNode;
			node.rightNode=rightNode;
			return node;
		}
		
	}
	public String toString()
	{
		int leftNodeCode = this.leftNode !=null ? this.leftNode.hashCode() : -1;
		int rightNodeCode = this.rightNode !=null ? this.rightNode.hashCode() : -1;
		return "leftNode hashCode ==>"+leftNodeCode+
				" value ===>"+this.value+" currentNode hashcode ==>"+this.hashCode()+"  rightNode hashCode ==>"+rightNodeCode+"\n";
	}
}
