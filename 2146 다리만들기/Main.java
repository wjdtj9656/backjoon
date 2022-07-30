import java.util.*;
import java.io.*;


class Pos{
	int x;
	int y;
	int cnt = 0;
	public Pos(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}
public class Main {
	static int N,map[][],color;
	static int min = (int)10e9;
	static boolean visit[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	public static void divideLocation(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x,y,0));
		visit[x][y] = true;
		color++;
		while(!q.isEmpty()) {
			Pos now = q.poll();
			for(int i=0; i<4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=N || visit[nx][ny]) continue;
				if(map[nx][ny] == map[x][y]) {
					visit[nx][ny] = true;
					map[nx][ny] = color;
					q.add(new Pos(nx,ny,0));
				}
			}
		}
		map[x][y] = color;
	}
	public static void createBridge(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x,y,0));
		visit = new boolean[N][N];
		visit[x][y] = true;
		while(!q.isEmpty()) {
			Pos now = q.poll();
			if(map[now.x][now.y] != 0 && map[x][y] != map[now.x][now.y]) {
				min = Math.min(min, now.cnt);
				//다른점에서 도착할 수도 있으므로 false
				visit[now.x][now.y] = false;
				continue;
			}
			for(int i=0; i<4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=N || visit[nx][ny]) continue;
				if(map[nx][ny] == map[x][y]) {
					q.add(new Pos(nx,ny,0));
					visit[nx][ny] = true;
				}
				else {
					q.add(new Pos(nx,ny,now.cnt+1));
					visit[nx][ny] = true;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		visit = new boolean[N][N];
		map = new int[N][N];
		//맵 입력
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//영역 나누기 bfs
		color = 1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visit[i][j] && map[i][j] != 0) divideLocation(i,j);
			}
		}
		//다리연결 bfs
		visit = new boolean[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j] != 0 && !visit[i][j])
				createBridge(i,j);
			}
		}
		System.out.println(min-1);
		br.close();
	}
}
