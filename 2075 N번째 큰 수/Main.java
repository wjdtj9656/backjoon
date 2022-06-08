import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				pq.add(Integer.parseInt(st.nextToken()));
			}
		}
		int size = N*N-N;
		for(int i=1; i<=size; i++) {
			pq.poll();
		}
		System.out.println(pq.poll());
		br.close();
	}
}