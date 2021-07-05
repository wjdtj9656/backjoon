package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1475 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 1;
		
		while(e!=1 || s!=1 || m!=1) {
			if(e==1) {
				e=15;
			}
			else {
				e--;
			}
			if(s==1) {
				s=28;
			}
			else {
				s--;
			}
			if(m==1) {
				m=19;
			}
			else {
				m--;
			}
			count++;
		}
		bw.write(String.valueOf(count));
		bw.flush();
		br.close();
		bw.close();
	}
}
