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
	static int R,C,ww,ss;
	static int arr[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static boolean visit[][];
	static void bfs(int x,int y) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x,y));
		visit[x][y] = true;
		int w = 0, s = 0;
		if(arr[x][y] == 'v') w++;
		else if(arr[x][y] == 'o') s++;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = node.x+dx[i];
				int ny = node.y+dy[i];
				if(nx<0 || ny<0 || nx>=R || ny>=C) continue;
				if(visit[nx][ny]) continue;
				visit[nx][ny] = true;
				if(arr[nx][ny] == '#') continue;
				if(arr[nx][ny] == 'v') w++;
				else if(arr[nx][ny] =='o') s++;
				q.add(new Node(nx,ny));
			}
		}
		if(w>=s) ww+=w;
		else ss+=s;
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new int[R][C];
        visit = new boolean[R][C];
        
        for(int i=0; i<R; i++) {
        	String s = br.readLine();
        	for(int j=0; j<C; j++) {
        		arr[i][j] = s.charAt(j);
        	}
        }
        for(int i=0; i<R; i++) {
        	for(int j=0; j<C; j++) {
        		if(arr[i][j]!='#' && !visit[i][j]) {
        			bfs(i,j);
        		}
        	}
        }
        bw.write(String.valueOf(ss+" "+ww));
        br.close();
        bw.flush();
        bw.close();
    }
}

