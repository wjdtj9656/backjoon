package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1018 problem
	*/
	static int arr[][];
	static int min=64;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		arr = new int[h][w];
		for(int i=0; i<h; i++) {
			String str = br.readLine();
			for(int j=0; j<w; j++) {
				if(str.charAt(j)=='B')
					arr[i][j] = 0;
				else {
					arr[i][j] = 1;
				}
			}
		}
		for(int i=0; i<h-7; i++) {
			for(int j=0; j<w-7; j++) {
				find(i,j);
			}
		}
		bw.write(String.valueOf(min));
		bw.flush();
		br.close();
		bw.close();
	}
	static void find(int a,int b) {
		int count = 0;
		int com = arr[a][b];
		
		for(int i=a; i<a+8; i++) {
			for(int j=b; j<b+8; j++) {
				if(arr[i][j] !=com) {
					count++;
				}
					if(com==0) {
						com=1;
					}
					else {
						com=0;
					}
			}
			if(com==0) {
				com=1;
			}
			else {
				com=0;
			}
		}
		count = Math.min(count, 64-count);
		min = Math.min(count, min);
	}
}
