	import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		static int N,M;
		static int map[][];
		static int count = 0;
		static int dx[] = {-1,0,1,0};
		static int dy[] = {0,1,0,-1};
		public static void clean(int x, int y, int see) {
			if(map[x][y]==0) {
				map[x][y] = 2;
				count++;
				}
			boolean flag = false;
			int origin = see;
			for(int i=0; i<4; i++) {
				int nSee = (see+3) % 4;
				int nx = x + dx[nSee];
				int ny = y + dy[nSee];
				if(nx>=0 && ny>=0 && nx<N && ny<M) {
					if(map[nx][ny] == 0) {
						clean(nx,ny,nSee);
						flag = true;
						break;
					}
				}
				see = (see + 3) % 4;
			}
			if(!flag) {
				int nSee = (origin + 2) % 4;
				int nnx = x + dx[nSee];
				int nny = y + dy[nSee];
				if(nnx>=0 && nny>=0 && nnx<N && nny<M) {
					if(map[nnx][nny] != 1) {
						clean(nnx,nny,origin);
					}
				}
			}
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	N = Integer.parseInt(st.nextToken());
	    	M = Integer.parseInt(st.nextToken());
	    	st = new StringTokenizer(br.readLine());
	    	int startX = Integer.parseInt(st.nextToken());
	    	int startY = Integer.parseInt(st.nextToken());
	    	int startSee = Integer.parseInt(st.nextToken());
	    	map = new int[N][M];
	    	for(int i=0; i<N; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		for(int j=0; j<M; j++) {
	    			map[i][j] = Integer.parseInt(st.nextToken());
	    		}
	    	}
	    	clean(startX,startY,startSee);
	    	bw.write(String.valueOf(count));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}