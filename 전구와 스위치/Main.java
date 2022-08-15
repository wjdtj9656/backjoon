import java.util.*;
import java.io.*;

public class Main {
	static char[] result;
	static int min = (int)1e9;
	static boolean brute(char[] now,int cnt) {
		for(int i=1; i<now.length; i++) {
			if(result[i-1] == now[i-1]) {
				continue;
			}
			else {
				cnt++;
				if(now[i-1] == '1') now[i-1] ='0';
				else now[i-1] ='1';
				if(now[i] == '1') now[i] ='0';
				else now[i] = '1';
				if(i+1 < now.length && now[i+1] == '1') now[i+1] = '0';
				else if(i+1<now.length) now[i+1] ='1';
			}
		}
		for(int i=0; i<now.length; i++) {
			if(result[i] != now[i]) {
				return false;
			}
		}
		min = Math.min(cnt, min);
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		char s1[] = s.toCharArray();
		result = br.readLine().toCharArray();
		char s3[] = s.toCharArray();
//		brute(s1);
		if(s1[0]-'0' == 1) {
			s3[0] = '0';
		}
		else {
			s3[0] = '1';
		}
		if(s1[1]-'0' == 1) {
			s3[1] = '0';
		}
		else {
			s3[1] = '1';
		}
		brute(s1,0);
		
		brute(s3,1);
		if(min == (int)1e9) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
		br.close();
	}
}