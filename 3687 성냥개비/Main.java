import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] minDp = new long[101];
		String maxDp[] = new String[101];
		Arrays.fill(minDp, Long.MAX_VALUE);
		minDp[2] = 1;
		minDp[3] = 7;
		minDp[4] = 4;
		minDp[5] = 2;
		minDp[6] = 6;
		minDp[7] = 8;
		minDp[8] = 10;
		
		String minNum[] = {"1","7","4","2","0","8"};
		for(int i=9; i<=100; i++) {
			for(int j=2; j<=7; j++) {
				String num = minDp[i-j]+minNum[j-2];
				minDp[i] = Math.min(Long.parseLong(num), minDp[i]);
			}
		}
		maxDp[2] = "1";
		maxDp[3] = "7";
		String s1 ="1";
		String s2 ="7";
		for(int i=4; i<=100; i++) {
			if(i % 2 == 0) {
				s1+="1";
				maxDp[i] = s1;
			}
			else {
				s2+="1";
				maxDp[i] = s2;
			}
			
		}
		for(int i=0; i<n; i++) {
			int res = Integer.parseInt(br.readLine());
			System.out.println(minDp[res] +" "+maxDp[res]);
		}
		br.close();
	}
}