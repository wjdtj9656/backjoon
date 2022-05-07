import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list[] = new ArrayList[N];
		int cnt[] = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			list[a].add(b);
			cnt[b]++;
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			if (cnt[i] == 0) {
				q.add(i);
			}
		}

		while (!q.isEmpty()) {
			int temp = q.poll();
			for (int i = 0; i < list[temp].size(); i++) {
				int value = list[temp].get(i);
				cnt[value]--;
				if (cnt[value] == 0) {
					q.add(value);
				}
			}
			sb.append((temp + 1) + " ");
		}
		System.out.println(sb.toString());
	}
}