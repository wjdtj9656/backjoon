import java.util.*;
import java.io.*;
class Monkey{
	int x;
	int y;
	int k;
	int cnt;
	public Monkey(int x,int y, int k, int cnt) {
		this.x = x;
		this.y = y;
		this.k = k;
		this.cnt = cnt;
	}
}
public class Main {
	static int K,W,H,map[][],rMap[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int dx2[] = {-1,-2,-2,-1,1,2,2,1};
	static int dy2[] = {-2,-1,1,2,2,1,-1,-2};
	static int result = (int)1e9;
	static boolean visit[][][];
	public static void bfs() {
		Queue<Monkey> q = new LinkedList<>();
		q.add(new Monkey(0,0,K,0));
		visit[0][0][K] = true;
		while(!q.isEmpty()) {
			Monkey mon = q.poll();
			if(mon.x == H-1 && mon.y == W-1) {
				result = mon.cnt;
				break;
			}
			for(int i=0; i<4; i++) {
				int nx = mon.x + dx[i];
				int ny = mon.y + dy[i];
				if(nx<0 || ny<0 || nx>=H || ny>=W || visit[nx][ny][mon.k] || map[nx][ny] == 1) continue;
				q.add(new Monkey(nx,ny,mon.k,mon.cnt+1));
				visit[nx][ny][mon.k] = true;
			}
			for(int i=0; i<8; i++) {
				int nx = mon.x + dx2[i];
				int ny = mon.y + dy2[i];
				if(mon.x == 5 && mon.y == 5) {
				}
				if(nx<0 || ny<0 || nx>=H || ny>=W ||  mon.k-1 < 0 || visit[nx][ny][mon.k-1] || map[nx][ny] == 1) continue;
				q.add(new Monkey(nx,ny,mon.k-1,mon.cnt+1));
				visit[nx][ny][mon.k-1] = true;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		map = new int[H][W];
		rMap = new int[H][W];
		visit = new boolean[H][W][K+1];
		for(int i=0; i<H; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<W; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs();
		if(result == (int)1e9) result = -1;
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}

}
