import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N+1];
		long result = 0;
		Queue<Integer> q[] = new LinkedList[21];
		for(int i=1; i<=N; i++) {
			arr[i] = br.readLine().length();
		}
		for(int i=2; i<=20; i++) {
			q[i] = new LinkedList<>();
		}
		for(int i=1; i<=N; i++) {
			int size = arr[i];
			if(q[size].isEmpty()) {
				q[size].add(i);
			}
			else {
				while(!q[size].isEmpty()) {
					if(i - q[size].peek() <= K) {
						result += q[size].size();
						q[size].add(i);
						break;
					}
					q[size].poll();
				}
				if(q[size].isEmpty()) q[size].add(i);
			}
		}
		System.out.println(result);
		br.close();
	}
}