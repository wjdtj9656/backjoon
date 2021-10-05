	import java.util.*;
	import java.io.*;
	
	class Main {
		static int map[][];
		static int r,c;
		static int max;
		static int dx[] = {-1,1,0,0};
		static int dy[] = {0,0,-1,1};
		static boolean visit[] = new boolean[26];
		
	    static void dfs(int x,int y,int count) {
	    	if(visit[map[x][y]]) {
	    		max = Math.max(max, count);
	    		return;
	    	}
	    	else {
	    		visit[map[x][y]] = true;
	    		for(int i=0; i<4; i++) {
	    			int nx = x + dx[i];
	    			int ny = y + dy[i];
	    			if(nx>=0 && ny>=0 && nx<r && ny<c) {
	    				dfs(nx,ny,count+1);
	    			}
	    		}
	    		visit[map[x][y]] = false;
	    	}
	    }
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	r = Integer.parseInt(st.nextToken());
	    	c = Integer.parseInt(st.nextToken());
	    	max = 0;
	    	map = new int[r][c];
	    	for(int i=0; i<r; i++) {
	    		String temp = br.readLine();
	    		for(int j=0; j<c; j++) {
	    			map[i][j] = temp.charAt(j) - 'A';
	    		}
	    	}
	    	dfs(0,0,0);
	    	bw.write(String.valueOf(max));
	    	
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}