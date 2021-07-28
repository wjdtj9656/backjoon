package Baekjoon;

import java.io.*;
import java.util.*; 


public class Main { 
	/*
	 * 14889 problem
	 */
	static int N;
	static int[][] map;
	static boolean [] visit;
	static int Min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		com(0,0);
		bw.write(String.valueOf(Min));
		br.close();
		bw.flush();
		bw.close();
	}
	static void com(int idx, int count) {
		if( count == N/2) {
			diff();
			return;
		}
		for(int i=idx; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				com(i+1,count+1);
				visit[i] = false;
			}
		}
	}
	static void diff() {
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				
				if(visit[i] == true && visit[j] ==true) {
					team_start +=map[i][j];
					team_start += map[j][i];
				}
				else if(visit[i] == false && visit[j]==false) {
					team_link += map[i][j];
					team_link += map[j][i];
				}
			}
		}
		int val = Math.abs(team_start - team_link);
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		Min = Math.min(val,Min);
	}
	
}
