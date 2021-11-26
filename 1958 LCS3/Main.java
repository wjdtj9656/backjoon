import java.util.*;
import java.io.*;
	
	class Main {
		public static int LCS(String s1, String s2, String s3) {
			int dp[][][] = new int[s1.length()+1][s2.length()+1][s3.length()+1];
			
			for(int i=1; i<=s1.length(); i++) {
				char ch1 = s1.charAt(i - 1);
				for(int j=1; j<=s2.length(); j++) {
					char ch2 = s2.charAt(j - 1);
					for(int k=1; k<=s3.length(); k++) {
						char ch3 = s3.charAt(k - 1);
						if(ch1 == ch2 && ch2 == ch3) {
							dp[i][j][k] = dp[i-1][j-1][k-1] + 1;
						}
						else {
							dp[i][j][k] = Math.max(dp[i-1][j][k], Math.max(dp[i][j-1][k], dp[i][j][k-1]));
						}
					}
				}
			}
			return dp[s1.length()][s2.length()][s3.length()];
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	String s1 = br.readLine();
	    	String s2 = br.readLine();
	    	String s3 = br.readLine();
	    	
	    	int len = LCS(s1, s2, s3);
	    	bw.write(String.valueOf(len));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}