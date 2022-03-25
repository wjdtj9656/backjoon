import java.util.*;
import java.io.*;


public class Main {
	static int N,M,map[][];
	static int result = 0;
	public static void dfs(int x,int y, int ox, int oy) {
		if(x == ox && y == oy) {
			result++;
			return;
		}
		if(x > ox || y > oy) return;
		
		dfs(x+1,y,ox,oy);
		dfs(x,y+1,ox,oy);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		int temp = 0;
		int goalX = 0, goalY = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				map[i][j] = ++temp;
				if(temp == K) {
					goalX = i;
					goalY = j;
				}
			}
		}
		int res1 = 1;
		int res2 = 1;
 		if(K != 0) {
			dfs(0,0,goalX,goalY);
			res1 = result;
		}
 		result = 0;
		dfs(goalX,goalY,N-1,M-1);
		res2 = result;
		if(res1 == 0) res1 = 1;
		if(res2 == 0) res2 = 1;
		bw.write(String.valueOf(res1 * res2));
		bw.flush();
		br.close();
		bw.close();
	}

}
