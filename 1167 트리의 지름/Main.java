import java.util.*;
import java.io.*;
	
	class Node{
		int x, y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	class Main {
		static int N;
		//static int arr[][];
		static ArrayList<Node> list[];
		static boolean visit[];
		static int max = 0;
		static Node maxN;
		public static Node dfs(Node node, int sum) {
			visit[node.x] = true;
			for(Node temp : list[node.x]) {
				if(!visit[temp.x]) {
					dfs(temp, sum+temp.y);
				}
				if(max < sum) {
					max = sum;
					maxN = node;
				}
			}
			return maxN;
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	N = Integer.parseInt(br.readLine());
	    	//arr = new int[N][N];
	    	visit = new boolean[N];
	    	list = new ArrayList[N];
	    	for(int i=0; i<N; i++) {
	    		list[i] = new ArrayList<>();
	    	}
	    	for(int i=0; i<N; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		int V = Integer.parseInt(st.nextToken());
	    		int next = Integer.parseInt(st.nextToken());
	    		while(next != -1) {
	    			int temp = Integer.parseInt(st.nextToken());
	    			list[V-1].add(new Node(next-1,temp));
	    			next = Integer.parseInt(st.nextToken());
	    		}
	    	}
	    	Node tmp = dfs(list[0].get(0), 0);
	    	visit = new boolean[N];
	        max = 0;
	        dfs(tmp, 0);

	    	bw.write(String.valueOf(max));
	    	
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}