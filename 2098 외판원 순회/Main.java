import java.util.*;
import java.io.*;
//주의할점 => (int)10e9쓰니까 오버플로...
public class Main {
	static int N,map[][],dp[][];
	public static int dfs(int start, int visit) {
		if(dp[start][visit] !=0) {
			return dp[start][visit];
		}
		if(visit == (1<<N)-1) {
			if(map[start][0] == 0) return (int)1e9;
			else return map[start][0];
		}
		int min = (int)1e9;
		for(int i=0; i<N; i++) {
			if( (visit & 1<<i)> 0 || map[start][i] == 0 ) continue;
			int result = map[start][i] + dfs(i, visit | 1<<i);
			min = Math.min(result, min);
		}
		return dp[start][visit] = min;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		dp = new int[N][1<<N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bw.write(String.valueOf(dfs(0,1)));
		bw.flush();
		br.close();
		bw.close();
	}

}
