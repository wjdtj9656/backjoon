import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		Set<String> hs = new HashSet<>();
		for(int i=0; i<n; i++) {
			hs.add(br.readLine());
		}
		int dp[] = new int[101];
		for(int i=s.length()-1; i>=0; i--) {
			for(int j=i+1; j<s.length(); j++) {
				if(dp[j] == 1) {
					if(hs.contains(s.substring(i,j))) dp[i] = 1;
				}
			}
			if(hs.contains(s.substring(i))) dp[i] = 1;
		}
		System.out.println(dp[0]);
		br.close();
	}
}