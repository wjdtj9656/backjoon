import java.io.*;
import java.util.*;
class Me{
	int x;
	int y;
	int cnt;
	boolean blockBreak;
	public Me(int x, int y, int cnt, boolean blockBreak) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
		this.blockBreak = blockBreak;
	}
}
public class Main {
	static int map[][],N,M;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	static int visit[][]; 
	/* visit
	 * 0=>안지나감
	 * 1=>벽안부수고 지나감
	 * 2=>벽부수고 지나감
	 */
	public static int bfs() {
		Queue<Me> q = new LinkedList<>();
		q.add(new Me(0,0,0,false));
		visit[0][0] = 1;
		while(!q.isEmpty()) {
			Me me = q.poll();
			if(me.x == N-1 && me.y == M-1) {
				return me.cnt+1;
			}
			for(int i=0; i<4; i++) {
				int nx = me.x + dx[i];
				int ny = me.y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=M ) continue;
				if(visit[nx][ny] == 1 || (visit[nx][ny]==2 && me.blockBreak)) continue;
				if(map[nx][ny] == 1 && !me.blockBreak) {
					visit[nx][ny] = 2;
					q.add(new Me(nx,ny,me.cnt+1, true));
				}
				else if(map[nx][ny] == 0 && !me.blockBreak) {
					visit[nx][ny] = 1;
					q.add(new Me(nx,ny,me.cnt+1, false));
				}
				else if(map[nx][ny] == 0 && me.blockBreak) {
					visit[nx][ny] = 2;
					q.add(new Me(nx,ny,me.cnt+1, true));
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    map = new int[N][M];
	    visit = new int[N][M];
	    for(int i=0; i<N; i++) {
	    	char c[] = br.readLine().toCharArray();
	    	for(int j=0; j<M; j++) {
	    		map[i][j] = c[j]-'0';
	    	}
	    }
	    int result = bfs();
	    bw.write(String.valueOf(result));
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
