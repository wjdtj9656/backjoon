import java.util.*;
import java.io.*;
class Node implements Comparable<Node>{
	int to;
	int dis;
	public Node(int to, int dis) {
		this.to = to;
		this.dis = dis;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.dis - o.dis;
	}
}
public class Main {
	static int N,dijk[],start,cnt;
	static boolean visit[];
	static ArrayList<Node> list[];
	public static void dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start,0));
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			
			if(!visit[cur.to]) {
				cnt++;
				visit[cur.to] = true;
			}
			else continue;
			
			for(int i=0; i<list[cur.to].size(); i++) {
				Node next = list[cur.to].get(i);
				if(dijk[next.to] > dijk[cur.to] + next.dis) {
					dijk[next.to] = dijk[cur.to] + next.dis;
					pq.add(new Node(next.to,dijk[next.to]));
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=testcase; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			start = Integer.parseInt(st.nextToken())-1;
			list = new ArrayList[N];
			visit = new boolean[N];
			cnt = 0;
			for(int i=0; i<N; i++) {
				list[i] = new ArrayList<>();
			}
			for(int i=0; i<d; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				int s = Integer.parseInt(st.nextToken());
				list[b].add(new Node(a,s));
			}
			dijk = new int[N];
			Arrays.fill(dijk, (int)1e9);
			dijk[start] = 0;
			dijkstra();
			int time = 0;
			for(int i=0; i<N; i++) {
				if(dijk[i] != (int)1e9) time = Math.max(dijk[i], time);
			}
			bw.write(String.valueOf(cnt+" "+time+"\n"));
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
