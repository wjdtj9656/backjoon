import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N + 1];
		HashMap<Integer, Long> hm = new HashMap<>();
		long result = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum[] = new int[N + 1];
		int nowSum = 0;
		for (int i = 1; i <= N; i++) {
			nowSum += arr[i];
			sum[i] += nowSum;
		}
		for (int i = 1; i <= N; i++) {
			if(sum[i] == K) result++;
			if (hm.containsKey(sum[i] - K)) {
				result += hm.get(sum[i] - K);
			}
			hm.put(sum[i], hm.getOrDefault(sum[i], 0L) + 1);
		}
		System.out.println(result);
		br.close();
	}
}