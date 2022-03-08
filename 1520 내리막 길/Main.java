import java.util.*;
import java.io.*;
class Pos implements Comparable<Pos>{
	int x;
	int y;
	int value;
	public Pos(int x,int y, int value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}
	@Override
	public int compareTo(Pos o) {
		// TODO Auto-generated method stub
		return o.value - this.value;
	}
}
public class Main {

	static int N,M,map[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	static boolean visit[][];
	static int cnt[][];
	public static void bfs(int x, int y, int value) {
		PriorityQueue<Pos> q = new PriorityQueue<>();
		q.add(new Pos(x,y,value));
		cnt[0][0] = 1;
		while(!q.isEmpty()) {
			Pos pos = q.poll();
			for(int i=0; i<4; i++) {
				int nx = pos.x + dx[i];
				int ny = pos.y + dy[i];
				if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny] < pos.value) {
					cnt[nx][ny] += cnt[pos.x][pos.y];
					if(visit[nx][ny]) continue;
					visit[nx][ny] = true;
					q.add(new Pos(nx,ny,map[nx][ny]));
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		cnt = new int[N][M];
		visit = new boolean[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs(0,0,map[0][0]);
		bw.write(String.valueOf(cnt[N-1][M-1]));
		bw.flush();
		br.close();
		bw.close();
	}

}
