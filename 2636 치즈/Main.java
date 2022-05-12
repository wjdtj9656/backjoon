import java.util.*;
import java.io.*;
class Pos{
	int x;
	int y;
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int N,M,map[][];
	static int tempMap[][];
	static boolean visit[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int rest = 0;
	public static boolean check(int tempMap[][]) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(tempMap[i][j] != 0) return true; 
			}
		}
		return false;
	}
	public static void bfs() {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(0,0));
		rest = 0;
		while(!q.isEmpty()) {
			Pos pos = q.poll();
			for(int i=0; i<4; i++) {
				int nx = pos.x + dx[i];
				int ny = pos.y + dy[i];
				if(nx<0 || nx>=N || ny<0 || ny>=M || visit[nx][ny]) continue;
				if(tempMap[pos.x][pos.y] == 0 && tempMap[nx][ny] == 1) {
					map[nx][ny] = 0;
					visit[nx][ny] = true;
					rest++;
					continue;
				}
				else{
					q.add(new Pos(nx,ny));
					visit[nx][ny] = true;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		tempMap = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				tempMap[i][j] = map[i][j];
			}
		}
		int cnt = 0;
		while(check(map)) {
			visit = new boolean[N][M];
			bfs();
			cnt++;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					tempMap[i][j] = map[i][j];
				}
			}
		}
		
	
		bw.write(String.valueOf(cnt+"\n"+rest));
		bw.flush();
		br.close();
		bw.close();
	}

}
