import java.util.*;
import java.io.*;

public class Main {
	static int N,Q;
	static long tree[];
	static int arr[];
	public static long init(int start, int end , int node) {
		if(start == end) return tree[node] = arr[start];
		int mid = (start+end)/2;
		return tree[node] = init(start,mid,node*2) + init(mid+1, end, node*2+1);
	}
	public static long sum(int start, int end, int node, int left, int right) {
		if(left > end || right < start) return 0;
		if(left <= start && end <= right) return tree[node];
		int mid = (start+end)/2;
		return sum(start,mid,node*2, left, right) + sum(mid+1, end, node*2+1, left, right);
	}
	public static long update(int start, int end,int node, int index, long dif) {
		if(index < start || index > end) return tree[node];
		if(start == end) return tree[node] = dif;
		int mid = (start + end)/2;
		return tree[node] =update(start,mid,node*2,index,dif)+update(mid+1,end,node*2+1,index,dif);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		tree = new long[N*4];
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i]  = Integer.parseInt(st.nextToken());
		}
		init(0,N-1,1);
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(x<y)
				bw.append(String.valueOf(sum(0,N-1,1,x-1,y-1)+"\n"));
			else
				bw.append(String.valueOf(sum(0,N-1,1,y-1,x-1)+"\n"));
			//int temp = b - arr[a-1];
			arr[a-1] = b;
			update(0,N-1,1,a-1,b);
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
