import java.util.*;
import java.io.*;

public class Main {
	static int map[][], n, min, max;
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };
	static boolean visit[][];

	public static boolean bfs(int value) {
		for (int num = min; num + value <= max; num++) {
			int start = num;
			int end = start + value;

			if (start > map[1][1] || map[1][1] > end)
				continue;
			Queue<int[]> q = new LinkedList<>();
			boolean visit[][] = new boolean[n + 1][n + 1];
			q.add(new int[] { 1, 1 });
			while (!q.isEmpty()) {
				int cur[] = q.poll();
				int x = cur[0];
				int y = cur[1];
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx <= 0 || nx > n || ny <= 0 || ny > n)
						continue;
					if (visit[nx][ny])
						continue;
					if (start > map[nx][ny] || map[nx][ny] > end)
						continue;
					if (nx == n && ny == n)
						return true;
					visit[nx][ny] = true;
					q.add(new int[] { nx, ny });

				}
			}
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1][n + 1];
		int start = (int) 1e9;
		int end = 0;
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				start = Math.min(start, map[i][j]);
				end = Math.max(end, Math.max(end, map[i][j]));
			}
		}
		min = start;
		max = end;
		end = end - start;
		start = 0;
		int res = 0;
		while (start <= end) {
			int mid = (start + end) >>> 1;
//			System.out.println(mid);
			if (bfs(mid)) {
				res = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
//			System.out.println(start+" "+end);
		}
		System.out.println(res);
		br.close();
	}
}