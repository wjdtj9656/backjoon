import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list[] = new ArrayList[N+1];
		int size[] = new int[N+1];
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=1; i<=M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			size[b]++;
		}
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=1; i<=N; i++) {
			if(size[i] == 0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int num = q.poll();
			sb.append(num+" ");
			for(int next : list[num]) {
				size[next]--;
				if(size[next] == 0) {
					q.add(next);
				}
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}