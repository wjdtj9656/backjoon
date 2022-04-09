import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int arr[],num;
	static boolean visit[],done[];
	static int result =0;
	public static void dfs(int f) {
		if(visit[f]) {
			done[f] = true;
			result++;
		}
		else {
			visit[f] = true;
		}
		if(!done[arr[f]]) dfs(arr[f]);
		visit[f] = false;
		done[f] = true;
	}
	    public static void main(String[] args) throws Exception {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        int testcase = Integer.parseInt(br.readLine());
	        
	        for(int tc=1; tc<=testcase; tc++) {
	        	num = Integer.parseInt(br.readLine());
	        	arr= new int[num+1];
	        	visit = new boolean[num+1];
	        	done = new boolean[num+1];
	        	result = 0;
	        	StringTokenizer st = new StringTokenizer(br.readLine());
	        	for(int i=1; i<=num; i++) {
	        		arr[i] = Integer.parseInt(st.nextToken());
	        	}
	        	for(int i=1; i<=num; i++) {
	        		if(!done[i]) dfs(i);
	        	}
	        	bw.append(String.valueOf(num-result+"\n"));
	        }
	        br.close();
	        bw.flush();
	        bw.close();
	    }
	}
