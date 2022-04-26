import java.io.*;
import java.util.*;

public class Main {
	static int N,M,arr[],minTree[],maxTree[];
	public static int initMin(int start, int end, int node) {
		if(start == end) return minTree[node] = arr[start];
		int mid = (start+end)/2;
		return minTree[node] = Math.min(initMin(start,mid,node*2), initMin(mid+1,end,node*2+1));
	}
	public static int initMax(int start, int end, int node) {
		if(start == end) return maxTree[node] = arr[start];
		int mid = (start+end)/2;
		return maxTree[node] = Math.max(initMax(start,mid,node*2), initMax(mid+1,end,node*2+1));
	}
	public static int min(int start, int end, int node, int left, int right) {
		if(left > end || right < start) return (int)10e9;
		if(start == end) return arr[start];
		if(left <= start && end <= right) return minTree[node];
		int mid = (start+end)/2;
		return Math.min(min(start,mid,node*2,left,right), min(mid+1,end,node*2+1,left,right));
	}
	public static int max(int start, int end, int node, int left, int right) {
		if(left > end || right < start) return 0;
		if(start == end) return arr[start];
		if(left <= start && end <= right) return maxTree[node];
		int mid = (start+end)/2;
		return Math.max(max(start,mid,node*2,left,right), max(mid+1,end,node*2+1,left,right));
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    minTree = new int[4*N];
	    maxTree = new int[4*N];
	    arr = new int[N];
	    for(int i=0; i<N; i++) {
	    	arr[i] = Integer.parseInt(br.readLine());
	    }
	    initMin(0,N-1,1);
	    initMax(0,N-1,1);
	    for(int i=0; i<M; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	int a = Integer.parseInt(st.nextToken())-1;
	    	int b = Integer.parseInt(st.nextToken())-1;
	    	bw.write(String.valueOf(min(0,N-1,1,a,b)+" "+max(0,N-1,1,a,b))+"\n");
	    }
	    bw.close();
	    br.close();
	    }
	}
