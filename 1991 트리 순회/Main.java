import java.util.*;
import java.io.*;
import java.math.*;
	class Node{
		char Data;
		Node Left, Right;
		public Node(char Data) {
			this.Data = Data;
		}
	}
	class Tree{
		Node root;
		
		public void Add(char Data, char LeftData, char RightData) {
			if(root == null) {
				if(Data != '.') root = new Node(Data);
				if(LeftData != '.') root.Left = new Node(LeftData);
				if(RightData != '.') root.Right = new Node(RightData);
			}
			else Search(root, Data, LeftData, RightData);
		}
		public void Search(Node root, char Data, char LeftData, char RightData) {
			if(root == null) return;
			else if(root.Data == Data) {
				if(LeftData != '.') root.Left = new Node(LeftData);
				if(RightData != '.') root.Right = new Node(RightData);
			}
			else{
				Search(root.Left, Data, LeftData, RightData);
				Search(root.Right, Data, LeftData, RightData);
			}
		}
		public void PreOrder(Node root) {
			System.out.print(root.Data);
			if(root.Left != null) PreOrder(root.Left);
			if(root.Right != null) PreOrder(root.Right);
		}
		public void InOrder(Node root) {
			if(root.Left != null) InOrder(root.Left);
			System.out.print(root.Data);
			if(root.Right != null) InOrder(root.Right);
		}
		public void PostOrder(Node root) {
			if(root.Left != null) PostOrder(root.Left);
			if(root.Right != null) PostOrder(root.Right);
			System.out.print(root.Data);
		}
	}
	class Main {
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	int N = Integer.parseInt(br.readLine());
	    	Tree tree = new Tree();
	    	for(int i=0; i<N; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		tree.Add(st.nextToken().charAt(0), st.nextToken().charAt(0), st.nextToken().charAt(0));
	    	}
	    	tree.PreOrder(tree.root);
	    	System.out.println();
	    	tree.InOrder(tree.root);
	    	System.out.println();
	    	tree.PostOrder(tree.root);
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}