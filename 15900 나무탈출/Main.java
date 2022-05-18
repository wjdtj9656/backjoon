import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		boolean visit[] = new boolean[N+1];
		List<Integer> list[] = new ArrayList[N+1];
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0; i<N-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {1,0});
		visit[1] = true;
		int sum = 0;
		while(!q.isEmpty()) {
			int cur[] = q.poll();
			int num = cur[0];
			int cnt = cur[1];
			//System.out.println(cur);
			int c = 0;
			for(int i=0; i<list[num].size(); i++) {
				int temp = list[num].get(i);
				if(visit[temp]) continue;
				visit[temp] = true;
				q.add(new int[] {temp,cnt+1});
				c++;
			}
			if(c==0) sum+=cnt;
		}
		if(sum % 2 == 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}