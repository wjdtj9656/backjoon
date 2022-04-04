import java.util.*;
import java.io.*;

public class Main {
	static int N,M,K;
	static long arr[];
	static long tree[];
	static long lazy[];
	public static long init(int start, int end, int node) {
		if(start==end) return tree[node] = arr[start];
		int mid = (start+end)/2;
		return tree[node] = init(start,mid,node*2) + init(mid+1,end,node*2+1);
	}
	public static long sum(int start,int end,int node, int left, int right) {
		lazyUpdate(start,end,node);
		if(left > end || start > right) return 0;
		
		if(left <= start && end <= right) return tree[node];
		
		int mid = (start + end)/2;
		return sum(start,mid,node*2,left,right) + sum(mid+1,end,node*2+1,left,right);
	}
	public static void update(int start, int end, int node, int left, int right, int dif) {
		lazyUpdate(start,end,node);
		if(right < start || left > end) return;
		if(left <= start && end <= right) {
			lazy[node] += dif;
			lazyUpdate(start,end,node);
			return;
		}
		int mid = (start+end)/2;
		update(start,mid,node*2,left,right,dif);
		update(mid+1,end,node*2+1,left,right,dif);
		tree[node] = tree[node*2] + tree[node*2+1];
	}
	public static void lazyUpdate(int start, int end, int node) {
		if(lazy[node] == 0) return;
		tree[node] += ((end-start+1) * lazy[node]);
		if(start != end ) {
			lazy[node*2] += lazy[node];
			lazy[node*2+1] += lazy[node];
		}

		lazy[node] = 0;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new long[N];
		tree = new long[4*N];
		lazy = new long[4*N];
		for(int i=0; i<N; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		init(0,N-1,1);
		for(int i=0; i<M+K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a==1) {
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				update(0,N-1,1,b-1,c-1,d);

			}
			else {
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				bw.append(String.valueOf(sum(0,N-1,1,b-1,c-1))+"\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
