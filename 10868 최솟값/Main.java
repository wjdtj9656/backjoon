import java.io.*;
import java.util.*;

public class Main {
	static int N,M,arr[],tree[];
	
	public static int init(int start, int end, int node) {
		if(start == end) return tree[node] = arr[start];
		int mid = (start+end)/2;
		return tree[node] = Math.min(init(start,mid,node*2), init(mid+1,end,node*2+1));
	}
	public static int min(int start, int end, int node, int left, int right) {
		if(left > end || right< start) return (int)10e9;
		if(left<=start && end <= right) return tree[node];
		int mid = (start+end)/2;
		return Math.min(min(start,mid,node*2,left,right), min(mid+1,end,node*2+1,left,right));
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    arr = new int[N];
	    tree = new int[4*N];
	    for(int i=0; i<N; i++) {
	    	arr[i] = Integer.parseInt(br.readLine());
	    }
	    init(0,N-1,1);
	    for(int i=0; i<M; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	int a = Integer.parseInt(st.nextToken())-1;
	    	int b = Integer.parseInt(st.nextToken())-1;
	    	bw.write(String.valueOf(min(0,N-1,1,a,b)+"\n"));
	    }
	    bw.close();
	    br.close();
	    }
	}
