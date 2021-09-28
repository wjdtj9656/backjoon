import java.util.*;
import java.io.*;

class Main {
	static int n;
	static int map[][];
	static int dp[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int max = 1;
	
	static int dfsdp(int x, int y) {
		//dp[x][y]==0은 첫방문이라는 뜻.
		if(dp[x][y] == 0) {
			dp[x][y] = 1;
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
				if(map[x][y] < map[nx][ny]) {
					dp[x][y] = Math.max(dp[x][y], dfsdp(nx,ny)+1);
				}
			}
		}
		
		}
		return dp[x][y];
	}
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	n = Integer.parseInt(br.readLine());
    	map = new int[n][n];
    	dp = new int[n][n];
    	//맵 입력받음.
    	for(int i=0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0; j<n; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	//dfs & dp
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    				max = Math.max(max, dfsdp(i,j));
    		}
    	}
    	bw.write(String.valueOf(max));
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}