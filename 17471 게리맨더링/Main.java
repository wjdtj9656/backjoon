import java.util.*;
import java.io.*;

public class Main {
	static int N,arr[];
	static int con[];
	static boolean visit[];
	static ArrayList list[];
	static int min = (int)10e9;
	public static void recur(int cnt, int sum) {
		if(cnt == N) {
			int one = 0;
			int two = 0;
			for(int i=1; i<=N; i++) {
				if(visit[i]) {
					one = i;
					if(two>0) break;
				}
				else {
					two = i;
					if(one>0) break;
				}
			}
			if(one ==0 || two == 0) return;
			boolean tempVisit[] = new boolean[N+1];
			Queue<Integer> q = new LinkedList<>();
			q.add(one);
			tempVisit[one] = true;
			while(!q.isEmpty()) {
				int now = q.poll();
				for(int i=0; i<list[now].size(); i++) {
					if(tempVisit[(int) list[now].get(i)])continue;
					if(!visit[(int)list[now].get(i)]) continue;
						tempVisit[(int)list[now].get(i)] = true;
						q.add((int)list[now].get(i));
				}
			}
			q.add(two);
			tempVisit[two] = true;
			while(!q.isEmpty()) {
				int now = q.poll();
				for(int i=0; i<list[now].size(); i++) {
					if(tempVisit[(int) list[now].get(i)])continue;
					if(visit[(int)list[now].get(i)]) continue;
						tempVisit[(int)list[now].get(i)] = true;
						q.add((int)list[now].get(i));
				}
			}
			for(int i=1; i<=N; i++) {
				if(!tempVisit[i]) return;
			}
			int sum1 = 0; int sum2 = 0;
			for(int i=1; i<=N; i++) {
				if(visit[i]) sum1+=arr[i];
				else sum2+=arr[i];
			}
			min = Math.min(min, Math.abs(sum1-sum2));
			return;
		}

		visit[cnt] = true;
		recur(cnt+1, sum + arr[cnt]);
		visit[cnt] = false;
		recur(cnt+1, sum + arr[cnt]);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		visit = new boolean[N+1];
		list = new ArrayList[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int size = Integer.parseInt(st.nextToken());
			for(int j=0; j<size; j++) {
				list[i].add(Integer.parseInt(st.nextToken()));
			}
		}
		recur(1,0);
		if(min == (int)10e9) min = -1;
		bw.write(String.valueOf(min));
		bw.flush();
		br.close();
		bw.close();
	}

}
