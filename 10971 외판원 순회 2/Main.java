import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int map[][];
	static int N;
	static boolean visit[];
	static int arr[];
	static int min = (int)10e9;
	public static void dfs(int cnt) {
		if(cnt == N) {
			int sum = 0;
			for(int i=0; i<N-1; i++) {
				if(map[arr[i]][arr[i+1]] == 0) return;
				sum += map[arr[i]][arr[i+1]];

			}
			if(map[arr[N-1]][arr[0]] == 0) return;
			sum += map[arr[N-1]][arr[0]];
			min = Math.min(min, sum);
			return;
		}
		for(int i=0; i<N; i++) {
			if(visit[i]) continue;
			visit[i] = true;
			arr[cnt] = i;
			dfs(cnt+1);
			visit[i] = false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N];
		arr = new int[N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);
		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
	}
}
