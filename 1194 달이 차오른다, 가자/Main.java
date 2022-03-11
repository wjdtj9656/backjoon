import java.util.*;
import java.io.*;
class Ms{
	int x;
	int y;
	int key;
	int cnt;
	public Ms(int x, int y, int key, int cnt) {
		this.x = x;
		this.y = y;
		this.key = key;
		this.cnt = cnt;
	}
}
public class Main {
	static int N,M;
	static char map[][];
	static boolean visit[][][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int result = -1;
	public static void bfs(int x,int y) {
		Queue<Ms> q = new LinkedList<>();
		q.add(new Ms(x, y, 0, 0));
		visit[x][y][0] = true;
		while(!q.isEmpty()) {
			Ms ms = q.poll();
			if(map[ms.x][ms.y] == '1') {
				result = ms.cnt;
				break;
			}
			for(int i=0; i<4; i++) {
				int nx = ms.x + dx[i];
				int ny = ms.y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=M || visit[nx][ny][ms.key] || map[nx][ny] == '#') continue;
				if(map[nx][ny] >= 'a' && map[nx][ny] <= 'f') {
					visit[nx][ny][ms.key | 1 <<map[nx][ny]-97] = true;
					q.add(new Ms(nx,ny,ms.key | 1 << map[nx][ny]-97,ms.cnt+1));
				}
				else if(map[nx][ny] >= 'A' && map[nx][ny] <= 'F') {
					if((ms.key & 1 << map[nx][ny]-65) == 0) continue;
					else {
						visit[nx][ny][ms.key] = true;
						q.add(new Ms(nx,ny,ms.key,ms.cnt+1));
					}
				}
				else {
					visit[nx][ny][ms.key] = true;
					q.add(new Ms(nx,ny,ms.key,ms.cnt+1));
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
		map = new char[N][M];
		visit = new boolean[N][M][1 << 6];
		int x = 0,y = 0;
		for(int i=0; i<N; i++) {
			char ch[] = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				map[i][j] = ch[j];
				if(map[i][j] == '0') {
					x = i;
					y = j;
				}
			}
		}
		bfs(x,y);
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}

}
