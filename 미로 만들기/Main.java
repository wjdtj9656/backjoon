import java.util.*;
import java.io.*;

class Node{
	int x;
	int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int n;
	static int map[][];
	static int distance[][];
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0};
	public static void bfs() {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0,0));
		distance[0][0] = 0;
		while(!q.isEmpty()) {
			Node cur = q.poll();
			for(int i=0; i<4; i++) {
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];
				if(nx >=0 && ny>=0 && nx<n && ny<n && distance[nx][ny] > distance[cur.x][cur.y]) {
					if(map[nx][ny] == 1) distance[nx][ny] = distance[cur.x][cur.y];
					else distance[nx][ny] = distance[cur.x][cur.y]+1;
					q.add(new Node(nx,ny));
				}
			}
		}
	}
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		distance = new int[n][n];
		for(int i=0; i<n; i++) {
			char c[] = br.readLine().toCharArray();
			for(int j=0; j<n; j++) {
				map[i][j] = c[j] -'0';
				distance[i][j] = (int)1e9;
			}
		}
		bfs();
		System.out.println(distance[n-1][n-1]);
		br.close();
	}
}