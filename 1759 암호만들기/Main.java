	import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
	
	class Main {
		static int L;
		static int C;
		static char[] arr;
		
		private static String dfs(int idx, String str) {
			if(str.length()==L && isValid(str)) {
				System.out.println(str);
				return str;
			}
			if(idx >= C) {
				return str;
			}
			dfs(idx+1, str + arr[idx]);
			dfs(idx+1, str);
			return str;
		}
		private static boolean isValid(String str) {
			if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
				str = str.replace("a","");
				str = str.replace("e","");
				str = str.replace("i","");
				str = str.replace("o","");
				str = str.replace("u","");
				if(str.length() >= 2) {
					return true;
					}
				}
			return false;
			}
				
		
		
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	L = Integer.parseInt(st.nextToken());
	    	C = Integer.parseInt(st.nextToken());
	    	arr = new char[C];
	    	
	    	st = new StringTokenizer(br.readLine());
	    	for(int i=0; i<C; i++) {
	    		arr[i] = st.nextToken().charAt(0);
	    	}
	    	Arrays.sort(arr);
	    	dfs(0,"");
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}