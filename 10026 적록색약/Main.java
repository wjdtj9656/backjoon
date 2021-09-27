import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

class Node{
	int x;
	int y;
	public Node(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
class Main {
	static int n, count, count2;
	static char map[][];
	static boolean visit[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	
	
	static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x,y));
		visit[x][y] = true;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			int x1 = node.x;
			int y1 = node.y;
			for(int i=0; i<4; i++) {
				int nx = x1 + dx[i];
				int ny = y1 + dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<n) {
					if(!visit[nx][ny] && map[nx][ny]==map[x1][y1]) {
						q.add(new Node(nx,ny));
						visit[nx][ny] = true;
					}
				}
			}
		}
	}
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	n = Integer.parseInt(br.readLine());
    	map = new char[n][n];
    	visit = new boolean[n][n];
    	
    	for(int i=0; i<n; i++) {
    		char[] s = br.readLine().toCharArray();
    		for(int j=0; j<n; j++) {
    			map[i][j] = s[j];
    		}
    	}
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(!visit[i][j]) {
    				bfs(i,j);
    				count++;
    			}
    		}
    	}
    	//적녹색약을 위해 위의 과정 한번더함.따라서 visit 초기화
    	visit = new boolean[n][n];
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(map[i][j] == 'G') map[i][j] ='R';
    		}
    	}
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(!visit[i][j]) {
    				bfs(i,j);
    				count2++;
    			}
    		}
    	}
    	bw.write(String.valueOf(count+" "+count2));
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}