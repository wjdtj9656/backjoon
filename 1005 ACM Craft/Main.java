import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int dp[] = new int[N+1];
			int arr[] = new int[N+1];
			boolean visit[] = new boolean[N+1];
			st = new StringTokenizer(br.readLine());
			for(int i=1; i<=N; i++) {
				dp[i] = Integer.parseInt(st.nextToken());
				arr[i] = dp[i];
			}
			//list => 진입점 체크 리스트
			//list2 = > 시작하는점 체크 리스트
			ArrayList<Integer> list[] = new ArrayList[N+1];
			ArrayList<Integer> list2[] = new ArrayList[N+1];
			for(int i=1; i<=N; i++) {
				list[i] = new ArrayList<>();
				list2[i] = new ArrayList<>();
			}
			for(int i=1; i<=K; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				list[end].add(start);
				list2[start].add(end);
			}
			int W = Integer.parseInt(br.readLine());
			Queue<Integer> q = new LinkedList<>();
			//진입점 없는 건설물 찾기
			for(int i=1; i<=N; i++) {
				if(list[i].size() == 0) {
					q.add(i);
					visit[i] = true;
				}
			}
			//진입점 없는 건선물 찾았으면 해당 연결 다끊고 다시 진입점 없는 연결 찾기..
			//연결끊으면서 dp계산
			//연결끊었는데 비었으면? q에넣기.
			while(!q.isEmpty()) {
				int temp = q.poll();
				for(int i=1; i<=list2[temp].size(); i++) {
					dp[list2[temp].get(i-1)] = Math.max(dp[list2[temp].get(i-1)], dp[temp] + arr[list2[temp].get(i-1)]);
					list[list2[temp].get(i-1)].remove(Integer.valueOf(temp));
					if(list[list2[temp].get(i-1)].size() == 0) q.add(list2[temp].get(i-1));
				}
			}
			bw.write(String.valueOf(dp[W]+"\n"));
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
