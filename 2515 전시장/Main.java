import java.util.*;
import java.io.*;
class Drawing implements Comparable<Drawing>{
	int height;
	int value;
	public Drawing(int height, int value) {
		this.height = height;
		this.value = value;
	}
	@Override
	public int compareTo(Drawing o) {
		// TODO Auto-generated method stub
		return this.height - o.height;
	}
}
public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int dp[] = new int[N];
		Drawing arr[] = new Drawing[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int height = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			arr[i] = new Drawing(height, value);
			
		}
		Arrays.sort(arr);
		for(int i=0; i<N; i++) {
			dp[i] = arr[i].value;
		}
		int max = 0;
		int canIndex = 0;
		for(int i=0; i<N; i++) {
			while(arr[i].height - arr[canIndex].height >= S && canIndex<i) {
				max = Math.max(max, dp[canIndex]);
				canIndex++;
			}
			dp[i] = max + arr[i].value;
		}
		for(int i=0; i<N; i++) {
			max = Math.max(max, dp[i]);
		}
		bw.write(String.valueOf(max));
		bw.flush();
		br.close();
		bw.close();
	}

}
