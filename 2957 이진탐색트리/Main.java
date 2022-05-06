import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> set = new TreeSet<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int depth[] = new int[N+2];
		
		set.add(0);
		set.add(N+1);
		depth[0] = -1;
		depth[N+1] = -1;
		long result = 0;
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			set.add(num);
			depth[num] = Math.max(depth[set.lower(num)], depth[set.higher(num)])+1;
			result += depth[num];
			sb.append(result+"\n");
		}
		System.out.println(sb.toString());
	}
}