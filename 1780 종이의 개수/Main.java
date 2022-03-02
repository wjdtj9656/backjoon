import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int map[][],N;
	static int r1,r2,r3;
	public static int check(int n,int row, int col) {
		int temp = map[row][col];
		for(int i=row; i<n+row; i++) {
			for(int j=col; j<n+col; j++) {
				if(map[i][j] != temp) return -2;
			}
		}
		return temp;
	}
	public static void dfs(int n, int row, int col) {
		int temp = check(n,row,col);
		if(temp != -2) {
			if(temp == -1) r1++;
			else if(temp == 0) r2++;
			else r3++;
			return;
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(n/3 > 1)
					dfs(n/3,i*n/3+row,j*n/3+col);
				else {
					int oneValue = map[row+i][col+j];
					if(oneValue == -1) r1++;
					else if(oneValue == 0) r2++;
					else if(oneValue == 1) r3++;
				}
					
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

	    bw.write(String.valueOf(r1+"\n"+r2+"\n"+r3));
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
