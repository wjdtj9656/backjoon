import java.util.*;
import java.io.*;

public class Main {
	static int N,M,arr[];
	public static boolean cal(int value) {
		int min = (int)1e9;
		int max = 0;
		int cnt = 1;
		for(int i=0; i<N; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
			if(max - min > value) {
				cnt++;
				min = arr[i];
				max = arr[i];
			}
		}
		return cnt<=M;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		int start = 0;
		int end = 10001;
		int mid = 0;
		int res = 0;
		while(start<=end) {
			mid = (start+end)/2;
			if(cal(mid)) {
				res = mid;
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		System.out.println(res);
		br.close();
	}
}