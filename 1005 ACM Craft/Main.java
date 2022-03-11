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
			//list => ������ üũ ����Ʈ
			//list2 = > �����ϴ��� üũ ����Ʈ
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
			//������ ���� �Ǽ��� ã��
			for(int i=1; i<=N; i++) {
				if(list[i].size() == 0) {
					q.add(i);
					visit[i] = true;
				}
			}
			//������ ���� �Ǽ��� ã������ �ش� ���� �ٲ��� �ٽ� ������ ���� ���� ã��..
			//��������鼭 dp���
			//��������µ� �������? q���ֱ�.
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
