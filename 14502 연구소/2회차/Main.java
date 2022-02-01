import java.io.*;
import java.math.*;
import java.util.*;
class Node{
	int x,y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int map[][];	
	static int N,M;
	static int count = 0;
	static int result = 0;
	static int max = 0;
	public static void dfs(int count) {
		if(count == 3) {
			result = 0;
			bfs(0,0);
			return;
		}
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<M; j++) {
        			if(map[i][j] == 0) {
        				map[i][j] = 1;
        				count++;
        				dfs(count);
        				count--;
        				map[i][j] = 0;
        			}
        		}
        	}
        }
	public static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		
		int vmap[][] = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				vmap[i][j] = map[i][j];
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(vmap[i][j] == 2) {
					q.add(new Node(i,j));
				}
			}
		}
		while(!q.isEmpty()) {
			Node node = q.poll();
			for(int i=0; i<4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				
				if(nx>=0 && ny>=0 && nx<N && ny<M && vmap[nx][ny] == 0) {
					vmap[nx][ny] = 2;
					q.add(new Node(nx,ny));
				}
			}
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(vmap[i][j] == 0) {
					result++;
				}
			}
		}
		max = Math.max(result, max);
	}
	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        N = Integer.parseInt(st.nextToken());
	        M = Integer.parseInt(st.nextToken());
	        map = new int[N][M];
	        for(int i=0; i<N; i++) {
        		st = new StringTokenizer(br.readLine());
	        	for(int j=0; j<M; j++) {
	        		map[i][j] = Integer.parseInt(st.nextToken());
	        	}
	        }
	        dfs(0);
	        bw.write(String.valueOf(max));
	        br.close();
	        bw.flush();
	        bw.close();
	    }
	}
