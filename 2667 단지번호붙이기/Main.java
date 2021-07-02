package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 2667 problem
	*/

	static ArrayList<Integer>[] list;
	static boolean visit[][];
	static int num=0;
	static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		list = new ArrayList[input];
		for(int i=0; i<input; i++) {
			list[i] = new ArrayList<Integer>();
		}
		visit = new boolean[input][input];
		

		for(int i=0; i<input; i++) {
			String str = br.readLine();
			for(int j=0; j<input; j++) {
				list[i].add(str.charAt(j)-'0');
			}
		}
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				if(list[i].get(j) == 1 && !visit[i][j]) {
					count = 0;
					num++;
					dfs(i,j,input);
					result.add(count);
				}
			}
		}
		bw.write(String.valueOf(num)+"\n");
		Collections.sort(result);
		for(int i=0; i<num;i++) {
			bw.write(String.valueOf(result.get(i)+"\n"));
		}
		bw.flush();
		br.close();
		bw.close();
	}
	private static void dfs(int a, int b, int input) {
		count++;
		visit[a][b] = true;
		
		if(b+1<input && list[a].get(b+1)==1 && visit[a][b+1]==false) {
			dfs(a,b+1,input);
		}
		if(a+1<input && list[a+1].get(b)==1 && visit[a+1][b]==false) {
			dfs(a+1,b,input);
		}
		if(b>=1 && list[a].get(b-1)==1 && visit[a][b-1]==false) {
			dfs(a,b-1,input);
		}
		if(a>=1 && list[a-1].get(b)==1 && visit[a-1][b]==false) {
			dfs(a-1,b,input);
		}
	}
}
