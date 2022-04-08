import java.io.*;
import java.util.*;

class Pos {
	int x;
	int y;

	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Dis implements Comparable<Dis> {
	int from;
	int to;
	int value;

	public Dis(int from, int to, int value) {
		this.from = from;
		this.to = to;
		this.value = value;
	}

	@Override
	public int compareTo(Dis o) {
		// TODO Auto-generated method stub
		return this.value - o.value;
	}
}

public class Main {
	static int N, M, map[][];
	static boolean visit[][];
	static int color = 1;
	static int maxColor;
	static int arr[];
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };
	static PriorityQueue<Dis> pq;

	public static void color(int x, int y) {
		color++;
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x, y));
		visit[x][y] = true;
		while (!q.isEmpty()) {
			Pos p = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (nx < 0 || ny < 0 || nx >= N || ny >= M || visit[nx][ny] || map[nx][ny] != 1)
					continue;
				q.add(new Pos(nx, ny));
				visit[nx][ny] = true;
				map[nx][ny] = color;
			}
		}
		map[x][y] = color;
	}

	public static void calDis(int x, int y, int dir) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x, y));
		int distance = 0;
		int save = 0;
		boolean flag = false;
		while (!q.isEmpty()) {
			Pos p = q.poll();
			int nx = p.x + dx[dir];
			int ny = p.y + dy[dir];
			if (nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] == color)
				break;
			q.add(new Pos(nx, ny));
			if (map[nx][ny] != 0) {
				if (distance < 2) {
					return;
				}
				flag = true;
				save = map[nx][ny];
				break;
			}
			distance++;
		}
		if (flag) {
			if (color <= save)
				pq.add(new Dis(color, save, distance));
			else
				pq.add(new Dis(save, color, distance));
		}
	}
	public static void makeSet(int maxColor) {
		arr = new int[8];
		for(int i=2; i<=maxColor+1; i++) {
			arr[i]= i;
		}
	}
	public static int findSet(int a) {
		if(a== arr[a]) return a;
		else return arr[a] = findSet(arr[a]);
	}
	public static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		if(aRoot == bRoot) return false;
		
		arr[bRoot] = aRoot;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == bRoot) {
				arr[i] = aRoot;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 맵 나누기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1)
					color(i, j);
			}
		}
		// 맵출력
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
		// 영역 개수 저장
		maxColor = color - 1;
		for (int k = color; k >= 2; k--) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == color) {
						calDis(i, j, 0);
						calDis(i, j, 1);
						calDis(i, j, 2);
						calDis(i, j, 3);
					}
				}
			}
			color--;
		}
		makeSet(maxColor);
		int cnt = 0;
		int result = 0;
		while(!pq.isEmpty()) {
			if(cnt == maxColor-1) break;
			Dis temp = pq.poll();
			if(union(temp.from,temp.to)) {
				result += temp.value;
				cnt++;
			}
		}
		if(cnt != maxColor-1) bw.write(String.valueOf(-1));
		else bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}