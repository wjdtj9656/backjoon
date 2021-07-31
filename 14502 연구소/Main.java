package Baekjoon;

import java.io.*;
import java.util.*; 
class Node {
	int x;
	int y;
	Node(int x,int y){
		this.x = x;
		this.y = y;
	}
}

public class Main { 
	/*
	 * 14502 problem
	 */
	static int N;
	static int M;
	static int map[][];
	static int arrx[] = {-1,1,0,0};
	static int arry[] = {0,0,-1,1};
	static int result = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					dfs(1);
					map[i][j] = 0;
				}
			}
		}
		
		
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();
	}
	public static void dfs(int cnt) {
		if(cnt == 3) {
			bfs();
			return;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					dfs(cnt+1);
					map[i][j] = 0;
				}
			}
		}
	}
	public static void bfs() {
		int vmap[][] = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				vmap[i][j] = map[i][j];
			}
		}
		Queue<Node> q = new LinkedList<Node>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(vmap[i][j]==2) {
					q.add(new Node(i,j));
				}
			}
		}
			while(!q.isEmpty()) {
				Node node = q.remove();
				int x = node.x;
				int y = node.y;
				for(int i=0; i<4; i++) {
					int ax = x + arrx[i];
					int ay = y + arry[i];
					
					if(ax>=0 && ay>=0 && ax<N && ay<M) {
						if(vmap[ax][ay] == 0) {
							vmap[ax][ay] = 2;
							q.add(new Node(ax,ay));
						}
					}
				}
			}
			calResult(vmap);
		}
	public static void calResult(int[][] vmap) {
		int cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(vmap[i][j]==0) {
					++cnt;
				}
			}
		}
		result = Math.max(cnt,result);
	}
	
}
