import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		static int N,K,L;
		static int map[][];
		//오른쪽, 아래, 왼쪽, 위
		static int dx[] = {0,1,0,-1};
		static int dy[] = {1,0,-1,0};
		static int[] time;
		static char[] direction;
		static int ans;
		static Deque<Point> q = new LinkedList<>();
		public static void play(int x, int y, int d) {
			int i=0;
			while(true) {
				if(i < L && ans == time[i]) {
					if(direction[i] == 'D') d = (d+1) % 4;
					else d = (d+3) % 4;
					i++;
				}
			
			int nx = x + dx[d];
			int ny = y + dy[d];
			q.addFirst(new Point(nx,ny));
			if(nx<=0 || ny<=0 || nx>N || ny>N) {
				ans++;
				break;
				}
			if(map[nx][ny] == 2) map[nx][ny] = 1;
			else if(map[nx][ny] == 0) {
				map[nx][ny] = 1;
				map[q.peekLast().x][q.peekLast().y] = 0;
				q.pollLast();
			}
			else {
				ans++;
				break;
			}
			x = nx;
			y = ny;
			ans++;
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	N = Integer.parseInt(br.readLine());
	    	K = Integer.parseInt(br.readLine());
	    	
	    	map = new int[N+1][N+1];
	    	
	    	for(int i=0; i<K; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 2;
	    	}
	 
	    	L = Integer.parseInt(br.readLine());
	    	time = new int[L];
	    	direction = new char[L];
	    	for(int i=0; i<L; i++) {
	    		StringTokenizer st = new StringTokenizer(br.readLine());
	    		time[i] = Integer.parseInt(st.nextToken());
	    		direction[i] = st.nextToken().charAt(0);
	    	}
	    	q.add(new Point(1,1));
	    	map[1][1] = 1;
	    	play(1,1,0);
	    	bw.write(String.valueOf(ans));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}