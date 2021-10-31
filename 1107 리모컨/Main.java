import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		static boolean broken[] = new boolean[10];
		static int possible(int num) {
			if(num == 0) {
				if(broken[0]) return 0;
				else return 1;
			}
			int len = 0;
			while(num > 0) {
				if(broken[num%10]) {
					return 0;
				}
				len++;
				num /= 10;
			}
			return len;
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	int N = Integer.parseInt(br.readLine());
	    	int brokenNum = Integer.parseInt(br.readLine());
	    	if(brokenNum > 0) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	for(int i=0; i<brokenNum; i++) {
	    		broken[Integer.parseInt(st.nextToken())] = true;
	    	}
	    	}
	    	//+-만으로 이동한 결과
	    	int ans = Math.abs(N-100);
	    	
	    	for(int i=0; i<=1000000; i++) {
	    		int num = i;
	    		int len = possible(num);
	    		//len이 0보다 크면 원하는 수에 가깝에 번호로 이동하는 것이 성공
	    		if(len > 0) {
	    			int press = Math.abs(num - N);
	    			if(ans > len+press) {
	    				ans = len+press;
	    			}
	    		}
	    	}
	    	bw.write(String.valueOf(ans));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}