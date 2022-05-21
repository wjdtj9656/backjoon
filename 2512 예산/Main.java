import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int left = 0;
		int right = arr[N-1];
		int result = 0;
		while(left<=right) {
			long sum = 0;
			int mid = (left+right)/2;
			for(int money : arr) {
				if(money >= mid) sum += mid;
				else sum += money;
			}
			if(sum > M) {
				right = mid-1;
			}
			else {
				left = mid+1;
				result = Math.max(result, mid);
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
