package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1260 problem
	*/

	static ArrayList<Integer>[] list;
	static boolean visit[];
			
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		list = new ArrayList[N+1];
		
		for(int i=1;i<N+1;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=1; i<M+1; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			list[first].add(second);
			list[second].add(first);
		}
		
		for(int i=1; i<N+1; i++) {
			Collections.sort(list[i]);
		}
		visit = new boolean[N+1];
		dfs(start);
		System.out.println();
		visit = new boolean[N+1];
		bfs(start);
		
		bw.flush();
		br.close();
		bw.close();
	}
	private static void dfs(int start) {
		if(visit[start]) {
			return;
		}
		else {
			visit[start] = true;
		System.out.print(start+" ");
		for(int i : list[start]) {
			if(!visit[i]) {
				dfs(i);
			}
		}
		}
		}
	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		if(visit[start]) {
			return;
		}
		else {
			visit[start] = true;
			q.add(start);
			while(!q.isEmpty()) {
				int num = q.poll();
				System.out.print(num+" ");
				for(int i : list[num]) {
					if(!visit[i]) {
						visit[i] = true;
						q.add(i);
					}
				}
			}
		}
	}
}
