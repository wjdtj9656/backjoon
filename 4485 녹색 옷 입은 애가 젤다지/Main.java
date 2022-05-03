import java.io.*;
import java.util.*;

class Pos implements Comparable<Pos>{
	int x;
	int y;
	int dis;
	public Pos(int x, int y, int dis) {
		this.x = x;
		this.y = y;
		this.dis = dis;
	}
	@Override
	public int compareTo(Pos o) {
		// TODO Auto-generated method stub
		return this.dis - o.dis;
	}
}
public class Main {
	static int N,map[][],result=(int)10e9;
	static boolean visit[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    N = 1;
	    int num = 0;
	    while(true) {
	    	N = Integer.parseInt(br.readLine());
	    	num++;
	    	if(N==0) break;
	    	map = new int[N][N];
	    	visit = new boolean[N][N];
	    	int dijk[][] = new int[N][N];
	    	for(int i=0; i<N; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		for(int j=0; j<N; j++) {
	    			map[i][j] = Integer.parseInt(st.nextToken());
	    			dijk[i][j] = (int)10e9;
	    		}
	    	}
	    	dijk[0][0] = map[0][0];
	    	PriorityQueue<Pos> pq = new PriorityQueue<>();
	    	pq.add(new Pos(0,0, map[0][0]));
	    	while(!pq.isEmpty()) {
	    		Pos cur = pq.poll();
	    		if(dijk[cur.x][cur.y] < cur.dis) continue;
	    		for(int i=0; i<4; i++) {
	    			int nx = cur.x + dx[i];
	    			int ny = cur.y + dy[i];
	    			if(nx<0 || ny<0 || nx>=N || ny>=N) continue;
	    			Pos next = new Pos(nx,ny,map[nx][ny]);
	    			if(dijk[next.x][next.y] > cur.dis + next.dis) {
	    				dijk[next.x][next.y] = cur.dis + next.dis;
	    				pq.add(new Pos(nx,ny,dijk[nx][ny]));
	    			}
	    		}
	    	}
	    	
	    	bw.write(String.valueOf("Problem "+num+": "+dijk[N-1][N-1]+"\n"));
	    }
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
