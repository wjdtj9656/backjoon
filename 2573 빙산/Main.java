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
	static int map[][];
	static int N,M;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static boolean visit[][];
	static boolean flag = false;
	public static void search(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {
					for(int k=0; k<4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny]!=0) {
							q.add(new Node(nx,ny));
						}
					}
				}
			}
		}
		while(!q.isEmpty()) {
			Node node = q.poll();
			int nx = node.x;
			int ny = node.y;
			if(map[nx][ny] != 0) map[nx][ny]--;
		}
	}
	public static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		//Arrays.fill(visit, false);
		
		visit[x][y] = true;
		q.add(new Node(x,y));
		while(!q.isEmpty()) {
			Node node = q.poll();
			for(int i=0; i<4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if(nx>=0 && ny>=0 && nx<N && ny<M && !visit[nx][ny] && map[nx][ny] !=0) {
					visit[nx][ny] = true;
					q.add(new Node(nx,ny));
				}
			}
		}
	}
	public static boolean check(int map[][]) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int count = 0;
		while(true) {
			search(0,0);
//		for(int i=0; i<N; i++) {
//			System.out.println();
//			for(int j=0; j<M; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//		}
		int temp = 0;
		visit = new boolean[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] != 0 && !visit[i][j]) {
					bfs(i,j);
					temp++;
				}
			}
		}
		count++;
		if(temp >= 2) {
			break;
		}
		flag = check(map);
		if(flag) {
			bw.write(String.valueOf(0));
			break;
			}
		}
		if(!flag) {
			bw.write(String.valueOf(count));
		}
		bw.flush();
		bw.close();
	}
}
