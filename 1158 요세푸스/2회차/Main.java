import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
				
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int temp = K-1;
		for(int i=1; i<N; i++) {
			int num = list.remove(temp);
			temp += K-1;
			temp %= list.size();
			sb.append(num+", ");
		}
		sb.append(list.get(0));
		sb.append(">");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
