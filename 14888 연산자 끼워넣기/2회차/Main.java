import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	static int max,min,N;
	static int arr[];
	static int four[];
	
	public static void dfs(int num, int cnt) {
		if(cnt == N) {
			max = Math.max(num, max);
			min = Math.min(num, min);
			return;
		}
		for(int i=0; i<4; i++) {
			if(four[i] > 0) {
				four[i]--;
				
				switch(i) {
				case 0: dfs(num + arr[cnt], cnt+1); break;
				case 1: dfs(num - arr[cnt], cnt+1); break;
				case 2: dfs(num * arr[cnt], cnt+1); break;
				case 3: dfs(num / arr[cnt], cnt+1); break;
				}
				four[i]++;
			}
			
			}
		}
		
	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        N = Integer.parseInt(br.readLine());
	        arr = new int[N];
	        four = new int[4];
	        max = -(int)10e9;
	        min = (int)10e9;
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for(int i=0; i<N; i++) {
	        	arr[i] = Integer.parseInt(st.nextToken());
	        }
	        st = new StringTokenizer(br.readLine());
	        for(int i=0; i<4; i++) {
	        	four[i] = Integer.parseInt(st.nextToken());
	        }
	        dfs(arr[0], 1);
	        bw.write(String.valueOf(max)+"\n");
	        bw.write(String.valueOf(min));
	        br.close();
	        bw.flush();
	        bw.close();
	    }
	}
