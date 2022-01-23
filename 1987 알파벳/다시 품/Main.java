import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int map[][];
	static boolean visit[][];
	static int r,c;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static HashSet<Integer> set = new HashSet<>();
	static int result = 0;
	
	public static void dfs(int x, int y, int cnt) {
		result = Math.max(result, cnt);
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && nx<r && ny>=0 && ny<c && !visit[nx][ny] && !set.contains(map[nx][ny])) {
				set.add(map[nx][ny]);
				visit[nx][ny] = true;
				dfs(nx, ny , cnt+1);
				set.remove(map[nx][ny]);
				visit[nx][ny] = false;
			}
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new int[r][c];
		visit = new boolean[r][c];
		for(int i=0; i<r; i++) {
			String s = br.readLine();
			for(int j=0; j<c; j++) {
				map[i][j] = s.charAt(j)-65;
			}
		}
		set.add(map[0][0]);
		visit[0][0] = true;
		dfs(0,0,0);
		bw.write(String.valueOf(++result));
		bw.flush();
		bw.close();
	}
}
