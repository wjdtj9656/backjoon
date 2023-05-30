import java.util.*;
import java.io.*;
public class Main_2961_도영이가만든맛있는음식 {
	static int N;
	static int S[];
	static int B[];
	static boolean visit[];
	static int min = (int)10e9;
	public static void search(int cnt) {
		if(cnt == N) {
			int tempS = 1;
			int tempB = 0;
			int falseCheck = 0;
			for(int i=0; i<N; i++) {
				if(visit[i] == true) {
					tempS *= S[i];
					tempB += B[i];
				}
				else falseCheck++;
			}
			if(falseCheck == N) return;
			int temp = Math.abs(tempS - tempB);
			min = Math.min(min, temp);
			return;
		}
		visit[cnt] = true;
		search(cnt+1);
		visit[cnt] = false;
		search(cnt+1);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		S = new int[N];
		B = new int[N];
		visit = new boolean[N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			S[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		search(0);
		
		bw.write(String.valueOf(min));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
