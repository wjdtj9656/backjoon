import java.io.*;
import java.util.*;

public class Main {
	static int N,M,arr[],result[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();
	public static void permutation(int cnt) {
		if(cnt == M) {
			for(int i=0; i<M; i++) {
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0; i<N; i++) {
			if(visit[i]) continue;
			visit[i] = true;
			result[cnt] = arr[i];
			permutation(cnt+1);
			visit[i] = false;
		}
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    arr = new int[N];
	    result = new int[M];
	    visit = new boolean[N];
	    st = new StringTokenizer(br.readLine());
	    for(int i=0; i<N; i++) {
	    	arr[i] = Integer.parseInt(st.nextToken());
	    }
	    Arrays.sort(arr);
	    permutation(0);
	    bw.write(sb.toString());
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
