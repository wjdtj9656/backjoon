import java.io.*;
import java.math.*;
import java.util.*;



public class Main {
	static int map[][],N;
	static int blue,white;
	static boolean check(int n, int row, int col) {
		int temp = map[row][col];
		for(int i=row; i<row+n; i++) {
			for(int j=col; j<col+n; j++) {
				if(temp != map[i][j]) return false;
			}
		}
		return true;
	}
	static void dfs(int n, int row, int col) {
		if(check(n, row, col)) {
			if(map[row][col] == 1) blue++;
			else white++;
			return;
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				dfs(n/2,i*n/2+row,j*n/2+col);
			}
		}
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	    N = Integer.parseInt(br.readLine());
	       
	    map = new int[N][N];    
	    
	    for(int i=0; i<N; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	for(int j=0; j<N; j++) {
	    		map[i][j] = Integer.parseInt(st.nextToken());
	    	}
	    }
	    dfs(N,0,0);

	    bw.write(String.valueOf(white+"\n"+blue));
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
