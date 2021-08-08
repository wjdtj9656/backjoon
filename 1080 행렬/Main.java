package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 1080 problem
	 */
	static int answer = 0;
	static int N;
	static int M;
	static int A[][];
	static int B[][];
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		B = new int[N][M];
		String s;
		for(int i=0; i<N; i++) {
			s = br.readLine();
			for(int j=0; j<M; j++) {
				A[i][j] = s.charAt(j)-'0';
			}
		}
		for(int i=0; i<N; i++) {
			s = br.readLine();
			for(int j=0; j<M; j++) {
				B[i][j] = s.charAt(j)-'0';
			}
		}
		if(N<3 || M<3) {
			if(isSame(A,B)) {
				answer = 0;
			}
			else {
				answer = -1;
			}
		}
		else {
			sol();
		}
		if(!isSame(A,B)) {
			answer = -1;
		}
		bw.write(String.valueOf(answer));
		
		br.close();
		bw.flush();
		bw.close();
	}
	private static void sol() {
		for(int i=0; i<N-2; i++) {
			for(int j=0; j<M-2; j++) {
				System.out.println(i+" "+j+" a" +A[i][j]+" b"+B[i][j]);
				if(A[i][j] != B[i][j]) {
					flip(i,j);
					answer++;
				}
			}
		}
	}
	private static void flip(int cr, int cn) {
		for(int i=cr; i<cr+3; i++) {
			for(int j=cn; j<cn+3; j++) {
				A[i][j] = A[i][j]^1;
			}
		}
	}
	private static boolean isSame(int A2[][],int B2[][]) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(A2[i][j] != B2[i][j]) return false;
			}
		}
		return true;
	}
}