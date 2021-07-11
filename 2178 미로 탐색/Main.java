package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 2178 problem
	*/
	public static int N,M;
	public static int map[][];
	public static boolean visit[][];
	public static int[] lr = {-1,1,0,0};
	public static int[] ub = {0,0,-1,1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		
		bw.write(String.valueOf(map[N-1][M-1]));
		
		bw.flush();
		br.close();
		bw.close();
	}
	public static void bfs(int i, int j) {
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {i,j});
		
		
		while(!q.isEmpty()) {
			int xy[] = q.poll();
			visit[i][j] = true;
			
			for(int a=0; a<4; a++) {
				int lrCheck = xy[0] + lr[a];
				int ubCheck = xy[1] + ub[a];
				
				if(lrCheck >=0 && ubCheck >= 0 && lrCheck<N && ubCheck <M) {
					if(!visit[lrCheck][ubCheck] && map[lrCheck][ubCheck] !=0) {
						q.add(new int[] {lrCheck,ubCheck});
						visit[lrCheck][ubCheck] = true;
						map[lrCheck][ubCheck] = map[xy[0]][xy[1]] + 1;
					}
				}
			}
		}
	}
}
