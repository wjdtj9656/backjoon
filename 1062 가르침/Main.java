import java.util.*;
import java.io.*;

public class Main {
	static int N, K;
	static boolean visit[];
	static String s[];
	static int result = 0;
	static int cnt = 0;

	static public void backtracking(int alpha, int len) {
		if (K - 5 == len) {
			int nCnt = 0;
			for (int i = 0; i < s.length; i++) {
				boolean canRead = true;
				for (int j = 0; j < s[i].length(); j++) {
					if (!visit[s[i].charAt(j) - 97]) {
						canRead = false;
						break;
					}
				}
				if (canRead)
					nCnt++;
			}
			result = Math.max(nCnt, result);
			return;
		}
		for (int i = alpha; i < 26; i++) {
			if (!visit[i]) {
				visit[i] = true;
				backtracking(i, len + 1);
				visit[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		s = new String[N];
		visit = new boolean[26];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			input = input.replace("anta", "");
			input = input.replace("tica", "");
			s[i] = input;
		}
		visit['a' - 97] = true;
		visit['n' - 97] = true;
		visit['t' - 97] = true;
		visit['i' - 97] = true;
		visit['c' - 97] = true;
		if (K < 5)
			System.out.println(0);
		else if (K == 26)
			System.out.println(N);
		else {
			backtracking(0, 0);
			System.out.println(result);
		}
		br.close();
	}
}