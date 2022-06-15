import java.util.*;
import java.io.*;

public class Main {
	static int A[], B[], C[], D[], AB[], CD[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		A = new int[n + 1];
		B = new int[n + 1];
		C = new int[n + 1];
		D = new int[n + 1];
		AB = new int[n * n];
		CD = new int[n * n];
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			A[i] = a;
			B[i] = b;
			C[i] = c;
			D[i] = d;
		}
		int index = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				AB[index] = A[i] + B[j];
				CD[index] = C[i] + D[j];
				index++;
			}
		}
		Arrays.sort(AB);
		Arrays.sort(CD);
		long cnt = 0;
		index--;
		for (int i = 0; i < AB.length && index>=0;) {
			int nowAB = AB[i];
			int nowCD = CD[index];
			int ABcnt = 0;
			int CDcnt = 0;
			int sum = nowAB + nowCD;
			if(sum == 0) {
				while(i<AB.length && nowAB == AB[i]) {
					i++;
					ABcnt++;
				}
				while(index>=0 && nowCD == CD[index]) {
					index--;
					CDcnt++;
				}
				cnt += (long)ABcnt * (long)CDcnt;
			}
			else if(sum>0) {
				index--;
			}
			else {
				i++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}