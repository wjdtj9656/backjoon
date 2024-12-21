import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    int map[][] = new int[N+1][N+1];
	    long distance[] = new long[N+1];
	    Arrays.fill(distance, (int)1e9);
	    distance[1] = 0;
	    for(int i=1; i<=N; i++) {
	    	for(int j=1; j<=N; j++) {
	    		if(i==j) map[i][j] = 0;
	    		else map[i][j] = (int)1e9;
	    	}
	    }
	    for(int i=0; i<M; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	int start = Integer.parseInt(st.nextToken());
	    	int end = Integer.parseInt(st.nextToken());
	    	int value = Integer.parseInt(st.nextToken());
	    	map[start][end] = Math.min(map[start][end], value);
	    }

	    for(int k=1; k<N; k++) {
	    	for(int i=1; i<=N; i++) {
	    		for(int j=1; j<=N; j++) {
	    			if(distance[i] == (int)1e9) continue;
	    			if(distance[j] > distance[i] + map[i][j])
	    				distance[j] = distance[i] + map[i][j];
	    		}
	    	}
	    }


	    boolean flag = false;
	    Loop1:
    	for(int i=1; i<=N; i++) {
    		for(int j=1; j<=N; j++) {
    			if(distance[i]==(int)1e9) continue;
    			if(distance[j] > distance[i] + map[i][j]) {
    				flag = true;
    				break Loop1;
    			}
    		}
    	}
	    if(flag) bw.append(String.valueOf(-1));
	    else {
	    	for(int i=2; i<distance.length; i++) {
	    		if(distance[i] == (int)1e9) bw.append(String.valueOf(-1+"\n"));
	    		else bw.append(String.valueOf(distance[i]+"\n"));
	    	}
	    }
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
