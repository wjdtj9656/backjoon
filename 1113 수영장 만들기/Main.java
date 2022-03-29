import java.util.*;
import java.io.*;
class Node{
	int x;
	int y;
	public Node(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static boolean visit[][];
	static int map[][],N,M;
	static int maxLevel;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static boolean flag;
	static int result;
	static Queue<Node> q = new LinkedList<>();
	public static int bfs(int level) {
		int cnt = 1;
		while(!q.isEmpty()) {
			Node node = q.poll();
			for(int i=0; i<4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=M) {
					flag = true;
					continue;
				}
				else if(!visit[nx][ny] && map[nx][ny] < level) {
					visit[nx][ny] = true;
					q.add(new Node(nx,ny));
					cnt++;
				}
			}
		}
		if(flag) return 0;
		else return cnt;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i=0; i<N; i++) {
			char c[] = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				map[i][j] = c[j]-'0';
				maxLevel = Math.max(maxLevel, c[j] - '0');
			}
		}
		for(int k=2; k<=maxLevel; k++) {
			visit = new boolean[N][M];
			for(int i=1; i<N; i++) {
				for(int j=1; j<M; j++) {
					flag = false;
					if(!visit[i][j] && map[i][j] < k) {
						visit[i][j] = true;
						q.add(new Node(i,j));
						result += bfs(k);
					}
				}
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}

}
