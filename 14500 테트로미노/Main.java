import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		static int[] dx = {0,0,-1,1};
    	static int[] dy = {-1,1,0,0};
    	static int[][] ex = {{0,0,0,1},{1,1,1,0},{0,1,2,1},{0,1,2,1}};
    	static int[][] ey = {{0,1,2,1},{0,1,2,1},{1,1,1,0},{0,0,0,1}};
    	static int N,M;
    	static int result = 0;
    	static int map[][];
    	static boolean check[][];
    	
    	static void dfs(int x, int y, int sum, int depth) {
    		if(depth >= 4) {
    			result = Math.max(result, sum);
    			return;
    		}
    		else {
    			int nx,ny;
    			for(int i=0; i<4; i++) {
    				nx = x + dx[i];
    				ny = y + dy[i];
    				
    				if(nx<0 || nx>=N || ny<0 || ny>=M) continue;
    				
    				if(!check[nx][ny]) {
    					check[nx][ny] = true;
    					dfs(nx,ny,(sum+map[nx][ny]), depth+1);
    					
    					check[nx][ny] = false;
    				}
    			}
    		}
    	}
    	static void except(int x, int y) {
    		int nx,ny,sum;
    		boolean outCheck = false;
    		for(int i=0; i<4; i++) {
    			sum = 0;
    			outCheck = false;
    			for(int j=0; j<4; j++) {
    				nx = x + ex[i][j];
    				ny = y + ey[i][j];
    				
    				if(nx<0 || nx>=N || ny<0 || ny>=M) {
    					outCheck = true;
    					continue;
    				}
    				sum += map[nx][ny];
    			}
    			if(!outCheck) result = Math.max(sum, result);
    		}
    	}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	N = Integer.parseInt(st.nextToken());
	    	M = Integer.parseInt(st.nextToken());
	    	map = new int[N][M];
	    	check = new boolean[N][M];
	    	
	    	for(int i=0; i<N; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		for(int j=0; j<M; j++) {
	    			map[i][j] = Integer.parseInt(st.nextToken());
	    		}
	    	}
	    	
	    	for(int i=0; i<N; i++) {
	    		for(int j=0; j<M; j++) {
	    			check[i][j] = true;
	    			dfs(i, j, map[i][j],1);
	    			check[i][j] = false;
	    			except(i,j);
	    		}
	    	}
	    	bw.write(String.valueOf(result));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}