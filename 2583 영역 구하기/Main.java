	import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		static int M,N,K;
		static boolean visit[][];
		static int dx[] = {-1,1,0,0};
		static int dy[] = {0,0,-1,1};
		static int count = 0;
		public static void dfs(int x, int y) {
			visit[x][y] = true;
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx>=0 && nx<M && ny>=0 && ny<N) {
					if(!visit[nx][ny]) {
					dfs(nx,ny);
					count++;
					}
				}
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	ArrayList<Integer> list = new ArrayList<>();
	    	int result = 0;
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	M = Integer.parseInt(st.nextToken());
	    	N = Integer.parseInt(st.nextToken());
	    	K = Integer.parseInt(st.nextToken());
	    	
	    	visit = new boolean[M][N];
	    	
	    	for(int i=0; i<K; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		int x1 = Integer.parseInt(st.nextToken());
	    		int y1 = Integer.parseInt(st.nextToken());
	    		int x2 = Integer.parseInt(st.nextToken());
	    		int y2 = Integer.parseInt(st.nextToken());
	    		for(int j=y1; j<y2; j++) {
	    			for(int k=x1; k<x2; k++) {
	    				visit[j][k] = true;
	    			}
	    		}
	    	}
	    	for(int i=0; i<M; i++) {
	    		for(int j=0; j<N; j++) {
	    			if(!visit[i][j]) {
	    				count = 1;
	    				result++;
	    				dfs(i,j);
	    				list.add(count);
	    			}
	    		}
	    	}
	    	Collections.sort(list);
	    	bw.write(String.valueOf(result+"\n"));
	    	for(int i=0; i<list.size(); i++) {
	    		bw.write(list.get(i)+" ");
	    	}
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}