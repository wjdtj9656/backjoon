import java.util.*;
import java.io.*;


public class Main {
	static int N,map[][],dp[][], result;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	public static void dfs(int x, int y, int status) {
		
		if(x == N-1 && y == N-1) {
			result++;
		}
		//status 0: 가로
		//status 1: 대각
		//status 2: 세로
		if(status == 0) {
			if(y+1 < N && map[x][y+1] == 0) {
				dfs(x, y+1, 0);
			}
			if(x+1 < N && y+1 < N && map[x+1][y+1] == 0 && map[x+1][y] == 0 && map[x][y+1] == 0) {
				dfs(x+1, y+1, 1);
			}
		}
		else if(status == 1) {
			if(y+1 < N && map[x][y+1] == 0) {
				dfs(x, y+1, 0);
			}
			if(x+1 < N && y+1 < N && map[x+1][y+1] == 0 && map[x+1][y] == 0 && map[x][y+1] == 0) {
				dfs(x+1, y+1, 1);
			}
			if(x+1 < N && map[x+1][y] == 0) {
				dfs(x+1,y,2);
			}
		}
		else if(status == 2) {
			if(x+1 < N && y+1 < N && map[x+1][y+1] == 0 && map[x+1][y] == 0 && map[x][y+1] == 0) {
				dfs(x+1, y+1, 1);
			}
			if(x+1 < N && map[x+1][y] == 0) {
				dfs(x+1,y,2);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		dp = new int[N][N];
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][1] = 1;
		dfs(0, 1, 0);
		bw.write(String.valueOf(result));
		br.close();
		bw.close();
	}

}
