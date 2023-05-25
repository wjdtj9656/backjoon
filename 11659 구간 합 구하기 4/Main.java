import java.io.*;
import java.math.*;
import java.util.*;



public class Main {

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    int arr[] = new int[N];
	    int sum[] = new int[N+1];
	    st = new StringTokenizer(br.readLine());
	    for(int i=0; i<N; i++) {
	    	arr[i] = Integer.parseInt(st.nextToken());
	    }
	    sum[0] = 0;
	    for(int i=1; i<=N; i++) {
	    	sum[i] += sum[i-1]+arr[i-1];
	    }
	    for(int i=0; i<M; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	int start = Integer.parseInt(st.nextToken());
	    	int end = Integer.parseInt(st.nextToken());
	    	int result = 0;
	    	result = sum[end] - sum[start-1];
	    	bw.append(String.valueOf(result+"\n"));
	    }
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
