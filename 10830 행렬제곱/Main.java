import java.io.*;
import java.util.*;
public class Main {
	
	static long map[][];
	static int n;
	public static long[][] pow(long b) {
		long temp[][] = new long[n][n];
		long partition[][];
		
		if(b==1) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					temp[i][j] = map[i][j] % 1000;
				}
			}
			return temp;
		}
		partition = pow(b/2);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					temp[i][j] += partition[i][k] * partition[k][j];
				}
				temp[i][j] %= 1000;
			}
		}
		if(b%2 == 1) {
			long odd[][] =new long[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					for(int k=0; k<n; k++) {
						odd[i][j] += (temp[i][k] * map[k][j]) % 1000;
					}
					odd[i][j] %= 1000;
				}
			}
			return odd;
		}else return temp;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    StringTokenizer st = new StringTokenizer(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    n = Integer.parseInt(st.nextToken());
	    long b = Integer.parseInt(st.nextToken());
	    map = new long[n][n];
	    for(int i=0; i<n; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	for(int j=0; j<n; j++) {
	    		map[i][j] = Integer.parseInt(st.nextToken());
	    	}
	    }
	    long result[][] = pow(b);
	    
	    for(int i=0; i<n; i++) {
	    	for(int j=0; j<n; j++) {
	    		sb.append(result[i][j]+" ");
	    	}
	    	sb.append("\n");
	    }
	    bw.write(sb.toString());
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
