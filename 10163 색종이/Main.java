import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int map[][] = new int[1001][1001];
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int nx = x + Integer.parseInt(st.nextToken());
			int ny = y + Integer.parseInt(st.nextToken());
			
			for(int j=x; j<nx; j++) {
				for(int k=y; k<ny; k++) {
					map[j][k] = i;
				}
			}
		}
		
		for(int value=1; value<=N; value++) {
			int result= 0;
			for(int i=0; i<1001; i++) {
				for(int j=0; j<1001; j++) {
					if(map[i][j] == value) {
						result++;
					}
				}
			}
			sb.append(String.valueOf(result+"\n"));
		}
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
