package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 7576 problem
	*/
	static int arr[][];
	static int N;
	static int M;
	static  boolean visit[][];
	static int lr[] = {1,-1,0,0};
	static int ud[] = {0,0,1,-1};
	static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		visit = new boolean[N][M];
		int max = 0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] =Integer.parseInt(st.nextToken());
			}
		}
		bfs();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j]==0) {
					bw.write(String.valueOf(-1));
					bw.flush();
					bw.close();
					br.close();
					return;
				}

				max = Math.max(max, arr[i][j]);
			}
		}
		bw.write(String.valueOf(max-1));
		bw.flush();
		br.close();
		bw.close();
	}
	static void bfs() {
		Queue<DOT> q = new LinkedList<>();
		
		for(int i =0;i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j]==1) {
					q.add(new DOT(i,j));
				}
			}
		}
		while(!q.isEmpty()) {
			DOT dot = q.poll();
			for(int i=0; i<4; i++) {
				int nx = dot.x +lr[i];
				int ny = dot.y +ud[i];
				
				if(nx<0 || nx>=N || ny<0 || ny>=M) {
					continue;
				}
				if(arr[nx][ny] !=0) {
					continue;
				}
				
				arr[nx][ny] = arr[dot.x][dot.y]+1;
				q.add(new DOT(nx,ny));
				
			}
		}
	
		

	}
	
	
}

class DOT{
	int x;
	int y;
	
	DOT(int x,int y){
		this.x = x;
		this.y = y;
	}
}

