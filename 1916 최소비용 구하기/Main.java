import java.util.*;
import java.io.*;
	
	class Main {
		static int N,M;
		static int map[][];
		public static void dijkstra(int v,int goal) {
			int distance[] = new int[N+1];
			boolean check[] = new boolean[N+1];
			
			for(int i=1; i<N+1; i++) {
				distance[i] = map[v][i];
			}
			
			check[v] = true;
			
			for(int num=1; num<N-1; num++) {
				int min = (int) 1e9;
				int min_index = -1;
				
				for(int i=1; i<=N; i++) {
					if(!check[i] && distance[i] < min) {
						min = distance[i];
						min_index = i;
					}
				}
				for(int i=1; i<=N; i++) {
					if(!check[i]) {
						distance[i] = Math.min(distance[i], distance[min_index] + map[min_index][i]);
					}
				}
			}
			
			System.out.println(distance[goal]);
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	N = Integer.parseInt(br.readLine());
	    	M = Integer.parseInt(br.readLine());
	    	map = new int[N+1][N+1];
	    	for(int i=1; i<=N; i++) {
	            for(int j=1; j<=N; j++) {
	                if(i != j) map[i][j] = (int)1e9;
	            }           
	        }
	    	for(int i=0; i<M; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		int x = Integer.parseInt(st.nextToken());
	    		int y = Integer.parseInt(st.nextToken());
	    		int value = Integer.parseInt(st.nextToken());
	    		map[x][y] = Math.min(map[x][y], value);
	    	}
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int start = Integer.parseInt(st.nextToken());
	    	int goal = Integer.parseInt(st.nextToken());
	    	dijkstra(start, goal);
 	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}