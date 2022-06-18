import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int start = 1;
		int end = k;
		
		while(start<end) {
			int mid = (start+end)/2;
			int cnt = 0;
			for(int i=1; i<=N; i++) {
				cnt += Math.min(mid/i, N);
			}
			if(cnt < k) {
				start = mid+1;
			}
			else {
				end = mid;
			}
		}
		System.out.println(start);
		br.close();
	}
}