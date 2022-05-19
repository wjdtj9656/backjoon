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
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int dis[][] = new int[N][M];
		int map[][] = new int[N][M];
		boolean visit[][] = new boolean[N][M];
		for(int i=0; i<N; i++) {
			String s =br.readLine();
			for(int j=0; j<M; j++) {
				map[i][j] = s.charAt(j) - '0';
				dis[i][j] = (int)1e9;
			}
		}
		Queue<Node> q = new LinkedList<>();
		dis[0][0] = 0;
		q.add(new Node(0,0));
		while(!q.isEmpty()) {
			Node cur = q.poll();
			for(int i=0; i<4; i++) {
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=M) continue;
				//if(visit[nx][ny]) continue;
				if(map[nx][ny] == 1) {
					if(dis[cur.x][cur.y] + 1 < dis[nx][ny]) {
						dis[nx][ny] = dis[cur.x][cur.y] + 1;
						q.add(new Node(nx,ny));
					}
				}
				else if (map[nx][ny] == 0) {
					if(dis[cur.x][cur.y] <dis[nx][ny]) {
						dis[nx][ny] = dis[cur.x][cur.y];
						q.add(new Node(nx,ny));
					}
				}
			}
			//visit[cur.x][cur.y] = true;
		}
		System.out.println(dis[N-1][M-1]);
		
	}
}