import java.util.*;
import java.io.*;
class Node{
	int x;
	int y;
	
	public Node(int x,int y) {
		this.x =x;
		this.y =y;
	}
}
public class Main {
    
	static int N,a1,b1,M;
	static int[] arr;
	static ArrayList[] list;
	static boolean[][] visit;
	
	public static int bfs(int x) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x,0));
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int tx = temp.x;
			int ty = temp.y;
			if(temp.x == b1) {
				return temp.y;
			}
			for(int i=0; i<list[temp.x].size(); i++) {
				if(visit[(int)list[temp.x].get(i)][temp.x] == false) {
				q.add(new Node((int) list[temp.x].get(i),temp.y+1));
				visit[(int)list[temp.x].get(i)][temp.x] = true;
				visit[temp.x][(int)list[temp.x].get(i)] = true;
				}
				
 			}
		}
		return -1;
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        b1 = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        list = new ArrayList[N+1];
        visit = new boolean[N+1][N+1];
        for(int i=1; i<=N; i++) {
        	list[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i<M; i++) {
        st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        list[t1].add(t2);
        list[t2].add(t1);
        }
        bw.write(String.valueOf(bfs(a1)));
        br.close();
        bw.flush();
        bw.close();
    }
}

