import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    int tc = Integer.parseInt(br.readLine());
	    for(int testcase=0; testcase<tc; testcase++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int M = Integer.parseInt(st.nextToken());
	    	int W = Integer.parseInt(st.nextToken());
	    	int map[][] = new int[N+1][N+1];
	    	int distance[] = new int[N+1];
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
	    		map[end][start] = Math.min(map[end][start], value);
	    	}
	    	for(int i=0; i<W; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		int start = Integer.parseInt(st.nextToken());
	    		int end = Integer.parseInt(st.nextToken());
	    		int value = Integer.parseInt(st.nextToken());
	    		map[start][end] = Math.min(map[start][end], -value);
	    	}

//	    	for(int i=1; i<=N; i++) {
//	    		for(int j=1; j<=N; j++) {
//	    			System.out.print(map[i][j]+" ");
//	    		}
//	    		System.out.println();
//	    	}
	    	boolean flag = false;
	    	for(int k=1; k<N; k++) {
	    	for(int i=1; i<=N; i++) {	
	    		for(int j=1; j<=N; j++) {
	    			if(distance[j] > distance[i]+map[i][j]) {
	    				distance[j] = distance[i] + map[i][j];
	    			}
	    		}
	    	}
	    	}
	    	Loop1:
	    	for(int i=1; i<=N; i++) {	
	    		for(int j=1; j<=N; j++) {
	    			if(distance[j] > distance[i]+map[i][j]) {
	    				distance[j] = distance[i] + map[i][j];
	    				flag = true;
	    			}
	    		}
	    	}

	    	if(flag)bw.append("YES"+"\n");
	    	else bw.append("NO"+"\n");
	    }
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
