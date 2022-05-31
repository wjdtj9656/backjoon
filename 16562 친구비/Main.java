import java.util.*;
import java.io.*;

public class Main {
	static int parent[], N;
	static int cost[];
	static int min[];

	public static void makeSet() {
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
	}

	public static int findSet(int a) {
		if (parent[a] == a)
			return a;
		return parent[a] = findSet(parent[a]);
	}

	public static boolean union(int a, int b) {
		int p1 = findSet(a);
		int p2 = findSet(b);
		if (p1 == p2)
			return false;
		parent[p2] = p1;
		if(min[p1] > min[p2]) {
			min[p1] = min[p2];
		}
		else {
			min[p2] = min[p1];
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		min = new int[N + 1];
		cost = new int[N + 1];
		parent = new int[N + 1];
		boolean visit[] = new boolean[N + 1];
		makeSet();
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
			min[i] = cost[i];
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a>b) {
				int temp = a;
				a = b;
				b = temp;
			}
			union(a,b);
		}
		long result = 0;
		for (int i = 1; i < parent.length; i++) {
//			System.out.println(parent[i]);
			int cur = findSet(parent[i]);
			if (!visit[cur]) {
//				System.out.println(min[cur]+" "+cur);
				result += min[cur];
				visit[cur] = true;
			}
		}
		if (result > k) {
			System.out.println("Oh no");
		} else
			System.out.println(result);
		br.close();
	}
}