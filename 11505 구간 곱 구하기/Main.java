import java.io.*;
import java.util.*;

public class Main {
	static int N,M,K;
	static long tree[],arr[];
	static long MODE = 1000000007;
	public static long init(int start, int end, int node) {
		if(start == end) return tree[node] = arr[start];
		int mid = (start+end)/2;
		return tree[node] = (init(start, mid, node*2) * init(mid+1,end,node*2+1)) % MODE;
	}
	public static long mul(int start, int end, int node, int left, int right) {
		if(start > right || end < left) return 1;
		if(left <= start && end <= right) return tree[node];
		int mid = (start+end)/2;
		return (mul(start,mid,node*2,left,right)*mul(mid+1,end,node*2+1,left,right)) % MODE;
	}
	public static long change(int start, int end,int node, int index, long val) {
		if(index<start || index > end) return tree[node];
		if(start == end) return tree[node] = val;
		int mid = (start+end)/2;
		return tree[node] = (change(start, mid, node * 2, index, val) * change(mid + 1, end, node * 2 + 1, index, val))
				% MODE;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new long[N];
		tree = new long[4*N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		init(0,N-1,1);
		//System.out.println(tree[1]+"start");
		for(int i=0; i<M+K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken())-1;
			if(a==1) {
				change(0,N-1,1,b,c+1);
				arr[b] = c+1;
				//System.out.println(tree[1]+"mid");
			}
			else if(a==2) {
				bw.write(String.valueOf(mul(0,N-1,1,b,c)+"\n"));
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
