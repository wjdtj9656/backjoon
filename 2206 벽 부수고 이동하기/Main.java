import java.io.*;
import java.math.*;
import java.util.*;

class Node{
	int x;
	int y;
	int cnt;
	boolean breakk;
	
	public Node(int x,int y, int cnt, boolean breakk) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
		this.breakk = breakk;
	}
}
public class Main {
	static int N,M;
	static int map[][];
	static boolean visit[][][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	public static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0,0,1,false));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			if(node.x == N-1 && node.y == M-1) {
				System.out.println(node.cnt);
				return;
			}
			for(int i=0; i<4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if(nx<0 || nx>=N || ny<0 || ny>=M ) continue;
				
				int nCnt = node.cnt+1;
				
				if(map[nx][ny] == '0') {
					if(!node.breakk && !visit[nx][ny][0]) {
						visit[nx][ny][0] = true;
						q.add(new Node(nx,ny,nCnt,false));
					}
					else if(node.breakk && !visit[nx][ny][1]){
						visit[nx][ny][1] = true;
						q.add(new Node(nx,ny,nCnt,true));
					}
				}
				else if(map[nx][ny] == '1') {
					if(!node.breakk) {
						visit[nx][ny][1] = true;
						q.add(new Node(nx,ny,nCnt,true));
					}
				}
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M][2];
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		bfs(0,0);
		bw.flush();
		bw.close();
	}
}
