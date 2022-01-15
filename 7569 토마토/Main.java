import java.io.*;
import java.math.*;
import java.util.*;
class Node{
	int x;
	int y;
	int z;
	public Node(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
public class Main {
	static int M,N,H;
	static int[] dx = { -1, 0, 1, 0, 0, 0 };
    static int[] dy = { 0, 1, 0, -1, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, -1, 1 };
    static int dist[][][],map[][][];
	static int count = 0;
	static Queue<Node> q = new LinkedList<>();
	static void bfs(int x,int y) {
		while(!q.isEmpty()) {
			Node node = q.poll();
			for(int i=0; i<dy.length; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				int nz = node.z + dz[i];
				if(nx>=0 && ny>=0 && nx<H && ny<N && nz>=0 && nz<M) {
					if (map[nx][ny][nz] == 0 && dist[nx][ny][nz] == 0) {
					q.add(new Node(nx,ny,nz));
					dist[nx][ny][nz] = dist[node.x][node.y][node.z] + 1;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		map = new int[H][N][M];
		dist = new int[H][N][M];
		for(int k=0; k<H; k++) {
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<M; j++) {
					map[k][i][j] = Integer.parseInt(st.nextToken());
					if(map[k][i][j] == 1) q.add(new Node(k,i,j));
				}
			}
		}
		bfs(0,0);
		
		int ans = 0;

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (ans < dist[k][i][j])
                        ans = dist[k][i][j];
                }
            }
        }

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[k][i][j] == 0 && dist[k][i][j] == 0) {
                        ans = -1;
                    }
                }
            }
        }
        bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
