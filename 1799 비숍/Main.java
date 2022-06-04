import java.util.*;
import java.io.*;

public class Main {
	static int N, map[][];
	static int result = 0;

	public static void dfs(int x, int y, int cnt,int state) {
		if (x >= N && y > N) {
			result = Math.max(result, cnt);
			return;
		}
		if (y >= N + 1) {
			if(state == 1) state =2;
			else state = 1;
			dfs(x + 1, state, cnt, state);
			return;
		}
		if (x >= N + 1) {
			return;
		}
		if (map[x][y] == 1) {
			if (canSet(x, y)) {
				map[x][y] = 2;
				dfs(x, y + 2, cnt + 1, state);
				map[x][y] = 1;
				dfs(x,y+2,cnt,state);
			} else {
				dfs(x, y + 2, cnt,state);
				return;
			}

		}
		else {
			dfs(x,y+2,cnt,state);
			return;
		}
	}

	public static boolean canSet(int x, int y) {
		for (int i = 1; i <= N; i++) {
			if (x + i <= 0 || x + i > N || y + i <= 0 || y + i > N)
				break;
			if (map[x + i][y + i] == 2) {
				return false;
			}
		}
		for (int i = 1; i <= N; i++) {
			if (x - i <= 0 || x - i > N || y - i <= 0 || y - i > N)
				break;
			if (map[x - i][y - i] == 2) {
				return false;
			}
		}
		for (int i = 1; i <= N; i++) {
			if (x + i <= 0 || x + i > N || y - i <= 0 || y - i > N)
				break;
			if (map[x + i][y - i] == 2) {
				return false;
			}
		}
		for (int i = 1; i <= N; i++) {
			if (x - i <= 0 || x - i > N || y + i <= 0 || y + i > N)
				break;
			if (map[x - i][y + i] == 2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(1, 1, 0, 1);
		dfs(1,2,result,2);
		System.out.println(result);
		br.close();
	}
}