import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int visit[] = new int[d + 1];
		int max = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for (int i = 0; i < k; i++) {
			if (visit[arr[i]] == 0) {
				visit[arr[i]]++;
				sum++;
			}
			else visit[arr[i]]++;
		}
		for (int i = 1; i < N; i++) {
			boolean flag = false;
			if (visit[c] == 0) {
				sum+=1;
				flag = true;
			}
			max = Math.max(max, sum);
			visit[arr[i - 1]]--;
			if (visit[arr[i - 1]] == 0)
				sum -= 1;
			if (visit[arr[((i + k) - 1) % N]] == 0)
				sum += 1;
			visit[arr[((i + k) - 1) % N]]++;
			if(flag) sum-=1;
		}

		bw.write(String.valueOf(max));

		bw.flush();
		bw.close();
		br.close();
	}
}
