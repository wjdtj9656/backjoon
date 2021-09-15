import java.util.*;
import java.io.*;
class Node{
	int x;
	int y;
	int jump;
	public Node(int x, int y, int jump) {
		this.x = x;
		this.y = y;
		this.jump = jump;
	}
}
public class Main {

	static int n;
	static int map[][];
	static boolean visit[][];
	static int cnt;
	static boolean check;
	static void bfs(int x, int y,int jump) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x,y,jump));
		while(!q.isEmpty()) {
			Node node = q.poll();
			int x1 = node.x;
			int y1 = node.y;
			int jump1 = node.jump;
			
		if(x1+jump1 <n && !visit[x1+jump1][y]) {
			if(map[x1+jump1][y] == -1) {
				check = true;
				return;
				}
			visit[x1+jump1][y1] = true;
			q.add(new Node(x1+jump1,y1,map[x1+jump1][y1]));
			}
		if(y1+jump1 <n && !visit[x1][y1+jump1]) {
			if(map[x1][y1+jump1] == -1) {
				check = true;
				return;
			}
			visit[x1][y1+jump1] = true;
			q.add(new Node(x1,y1+jump1,map[x1][y1+jump1]));
		}
		}
	}
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	n = Integer.parseInt(br.readLine());
    	map = new int[n][n];
    	visit = new boolean[n][n];
    	for(int i=0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0; j<n; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	bfs(0,0,map[0][0]);
    	if(check == true) {
    		bw.write("HaruHaru");
    	}
    	else {
    		bw.write("Hing");
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}