import java.util.*;
import java.io.*;

class Main {
	
	static int n;
	static int map[][];
	static int changedMap[][];
	static boolean visit[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int maxrain = 0;
	static int cnt = 0;
	static void search(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int tx = x + dx[i];
			int ty = y + dy[i];
			
			if(ty>=0 && tx>=0 && tx<n && ty<n) {
				if(changedMap[tx][ty]==1 && visit[tx][ty]==false) {
					search(tx,ty);
				}
			}
		}
		
	}
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	n = Integer.parseInt(br.readLine());
    	map = new int[n][n];
    	int result = 0;
    	
    	for(int i=0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0; j<n; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    			maxrain = Math.max(maxrain, map[i][j]);
    		}
    	}
    	for(int i=0; i<=maxrain; i++) {
    		cnt = 0;
    		changedMap = new int[n][n];
    		visit = new boolean[n][n];
    		
    		for(int j=0; j<n; j++) {
    			for(int k=0; k<n; k++) {
    				if(map[j][k] <= i) {
    					changedMap[j][k] = 0;
    				}
    				else {
    					changedMap[j][k] = 1;
    				}
    			}
    		}
    		for(int j=0; j<n; j++) {
    			for(int k=0; k<n; k++) {
    				if(changedMap[j][k]==1 && visit[j][k]==false) {
    					search(j,k);
    					cnt++;
    				}
    			}
    		}
    		result = Math.max(result, cnt);
    	}
    	bw.write(String.valueOf(result));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}