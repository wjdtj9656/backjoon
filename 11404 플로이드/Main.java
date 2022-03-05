import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    int m = Integer.parseInt(br.readLine());
	    int map[][] = new int[n+1][n+1];
	    for(int i=1; i<=n; i++) {
	    	for(int j=1; j<=n; j++) {
	    		if(i==j) map[i][j] = 0;
	    		else map[i][j] = (int)10e9;
	    	}
	    }
	    for(int i=0; i<m; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int start = Integer.parseInt(st.nextToken());
	    	int end = Integer.parseInt(st.nextToken());
	    	int value = Integer.parseInt(st.nextToken()); 
	    	map[start][end] = Math.min(map[start][end], value);
	    }

	    for(int k=1; k<=n; k++) {
	    	for(int i=1; i<=n; i++) {
	    		for(int j=1; j<=n; j++) {
	    			if(map[i][k] == (int)10e9 || map[k][j] == (int)10e9) continue;
	    			map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
	    		}
	    	}
	    }
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			if(map[i][j] == (int)10e9) map[i][j] = 0;
    			System.out.print(map[i][j]+" ");
    		}
    		System.out.println();
    	}
	    br.close();
	    }
	}
