import java.util.*;
import java.io.*;
class Node{
	int x;
	int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	
	static int n,a,b;
	static int arr[];
	static int visit[];
	static boolean flag = false;
	static int count;
	
	static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		Arrays.fill(visit, 0);
		q.add(new Node(x,0));
		visit[x] = 1;
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			if(temp.x == y) {
				count = temp.y;
				flag = true;
			}
			int c = temp.x;
			int d = temp.y;
			
			for(int i=1; c+(arr[c]*i)<=n; i++) {
				int nc = c + arr[c] * i;
				if(visit[nc] == 0) {
					visit[nc] = 1;
					q.add(new Node(nc,d+1));
				}
			}
			for(int i=1; c-(arr[c]*i)>=1; i++) {
				int nc = c - arr[c] * i;
				if(visit[nc] == 0) {
					visit[nc] = 1;
					q.add(new Node(nc,d+1));
				}
			}
		}
	}
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	n = Integer.parseInt(br.readLine());
    	arr = new int[n+1];
    	visit = new int[n+1];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=1; i<=n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	st = new StringTokenizer(br.readLine());
    	a = Integer.parseInt(st.nextToken());
    	b = Integer.parseInt(st.nextToken());
    	bfs(a,b);
    	bw.write(String.valueOf(flag? count:-1));
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}