import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int start = 0;
		int end = 0;
		int result = 0;
		int sum = 0;
		while(start<=end && end<N && start<N) {
			if(sum >= M) {
				sum -= arr[start];
				start++;
			}
			else if(N == end) break;
			else if(sum < M) {
				sum += arr[end];
				end++;
			}
			if(sum == M) {
				result++;
			}
		}
		System.out.println(result);
		br.close();
	}
}
