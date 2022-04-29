import java.util.*;
import java.io.*;

public class Main {
	static int N, arr[];
	public static int twoPoint(int i) {
		int start = 0;
		int end = N-1;
		while(true) {
			if(i == start) start++;
			else if(i == end) end--;
			if(start>=end) break;
			int sum = arr[start] + arr[end];
			if(sum < arr[i]) start++;
			else if(sum > arr[i]) end--;
			else return 1;
			
		}
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		int result = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		if(N<=2) {
			System.out.println(0);
			System.exit(0);
		}
		for(int i=0; i<N; i++) {
			result+=twoPoint(i);
		}
		System.out.println(result);

		br.close();
	}
}