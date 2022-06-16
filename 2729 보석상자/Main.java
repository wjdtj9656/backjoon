import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[M+1];
		int start = 1;
		int end = 0;
		for(int i=1; i<=M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			end = Math.max(end, arr[i]);
		}
		int res = 0;
		while(start<=end) {
			int mid = (start + end) >>1;
			int cnt = 0;
			for(int i=1; i<=M; i++) {
				cnt += arr[i]/mid;
				if(arr[i] % mid !=0) {
					cnt++;
				}
			}
			if(cnt > N) {
				start = mid +1;
			}
			else {
				end = mid-1;
				res = mid;
			}
		}
		System.out.println(res);
		br.close();
	}
}