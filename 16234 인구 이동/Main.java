import java.util.*;
import java.io.*;
import java.math.*;
	class Node{
		int x;
		int y;
		public Node(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	class Main {
		static int N, L , R;
		static int arr[][];
		static boolean visit[][];
		static int nation[][];
		static int dx[] = {-1,1,0,0};
		static int dy[] = {0,0,-1,1};
		static int sum = 0;
		static int result = 0;
		static int flag = 0;
		public static void bfs(Node node) {
			Queue<Node> q = new LinkedList<>();
			ArrayList<Node> save = new ArrayList<>();
			int tempCount = 0;
			sum = 0;
			visit[node.x][node.y] = true;
			q.add(node);
			while(!q.isEmpty()) {
				Node temp = q.poll();
				save.add(temp);
				int x = temp.x;
				int y = temp.y;
				sum += arr[x][y];
				tempCount++;
				
				for(int i=0; i<4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if(nx>=0 && nx<N && ny>=0 && ny<N &&!visit[nx][ny] && Math.abs(arr[x][y] - arr[nx][ny])>= L && Math.abs(arr[x][y] - arr[nx][ny])<= R) {
						q.add(new Node(nx,ny));
						visit[nx][ny] = true;
					}
				}
			}
			int divide = sum/tempCount;
			for(int i=0; i<save.size(); i++) {
				Node temp = save.get(i);
				arr[temp.x][temp.y] = divide;
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	N = Integer.parseInt(st.nextToken());
	    	L = Integer.parseInt(st.nextToken());
	    	R = Integer.parseInt(st.nextToken());
	    	
	    	arr = new int[N][N];
	    	
	    	for(int i=0; i<N; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		for(int j=0; j<N; j++) {
	    			arr[i][j] = Integer.parseInt(st.nextToken());
	    		}
	    	}
	    	while(true) {
	    		visit = new boolean[N][N];
	    		nation = new int[N][N];
	    		flag = 0;
	    		for(int i=0; i<N; i++) {
	    			for(int j=0; j<N; j++) {
	    				Node node = new Node(i,j);
	    				int x = node.x;
	    				int y = node.y;
	    				for(int k=0; k<4; k++) {
	    					int nx = x + dx[i];
	    					int ny = y + dy[i];
	    					if(nx>=0 && nx<N && ny>=0 && ny<N) {
	    						if(Math.abs(arr[x][y] - arr[nx][ny])>= L && Math.abs(arr[x][y] - arr[nx][ny])<= R) {
	    							nation[x][y] = 1;
	    							nation[nx][ny] = 1;
	    							flag++;
	    						}
	    					}
	    				}
	    			}
	    		}
	    		if(flag == 0) break;
	    		else {
	    			result++;
	    		}
	    		for(int i=0; i<N; i++) {
	    			for(int j=0; j<N; j++) {
	    				if(nation[i][j] == 1 && !visit[i][j]) {
	    					bfs(new Node(i,j));
	    				}
	    			}
	    		}
	    	}
	    	bw.write(String.valueOf(result));
	    	
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}