import java.io.*;
import java.math.*;
import java.util.*;
class Node{
	int x;
	int y;
	public Node(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static boolean map[][];
	static boolean visit[][];
	static int N,M;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static ArrayList<Node>[][] list;
	static int bfs(int nx, int ny) {
		Queue<Node> q = new ArrayDeque<>();
		for(int i=0; i<N; i++) {
			Arrays.fill(visit[i], false);
		}
		visit[nx][ny] = true;
		q.add(new Node(nx,ny));
		boolean flag = false;
		int cnt = 0;
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			for(Node light : list[node.x][node.y]) {
				if(!map[light.x][light.y]) {
					map[light.x][light.y] = true;
					cnt++;
					flag = true;
				}
			}
			
			for(int i=0; i<4; i++) {
				int nnx = node.x + dx[i];
				int nny = node.y + dy[i];
				
				if(nnx>=0 && nny>=0 && nnx<N && nny<N && !visit[nnx][nny] && map[nnx][nny]) {
					q.add(new Node(nnx,nny));
					visit[nnx][nny] = true;
				}
			}
		}
		if(flag) {
			cnt += bfs(0,0);
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new boolean[N][N];
		map[0][0] = true;
		visit = new boolean[N][N];
		int count = 0;
		list = new ArrayList[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				list[i][j] = new ArrayList<Node>();
			}
		}
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			int nextX = Integer.parseInt(st.nextToken())-1;
			int nextY = Integer.parseInt(st.nextToken())-1;
			list[x][y].add(new Node(nextX,nextY));
		}
		
		int ans = bfs(0,0) + 1;
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
