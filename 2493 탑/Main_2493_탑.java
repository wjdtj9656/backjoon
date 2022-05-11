import java.util.*;
import java.io.*;
public class Main_2493_탑 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Stack<int []> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				if(stack.peek()[1] < num) {
					stack.pop();
				}
				else {
					sb.append(String.valueOf(stack.peek()[0] +" "));
					break;
				}
			}
			if(stack.isEmpty())
			sb.append("0 ");
			stack.push(new int[] {i, num});
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
