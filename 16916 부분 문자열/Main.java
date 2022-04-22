import java.util.*;
import java.io.*;

public class Main {
	static String str;
	static String pattern;
	static int pi[],result;
		public static void getPi() {
			int j=0;
			for(int i=1; i<pattern.length(); i++) {
				while(j>0 && pattern.charAt(i) != pattern.charAt(j)) {
					j = pi[j-1];
				}
				if(pattern.charAt(i) == pattern.charAt(j)) {
					j++;
				}
			}
		}
		public static void kmp() {
			int j=0;
			for(int i=0; i<str.length(); i++) {
				while(j > 0 && str.charAt(i) != pattern.charAt(j)) {
					j = pi[j-1];
				}
				if(str.charAt(i) == pattern.charAt(j)) {
					if(j == pattern.length()-1) {
						result++;
						break;
					}
				}
				j++;
			}
		}
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			pattern = br.readLine();
			
			pi = new int[pattern.length()];

			getPi();
			kmp();
			System.out.println(result);
			br.close();
		}
	}
