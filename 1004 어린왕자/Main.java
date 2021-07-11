package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1004 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		for(int i=0; i<tc; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int count = 0;
			
			int num = Integer.parseInt(br.readLine());
			for(int j=0; j<num; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				boolean check1=false,check2 = false;
				
				if(Math.pow(x1-x, 2) + Math.pow(y1-y, 2) > Math.pow(r, 2)) {
					check1 = true;
				}
				if(Math.pow(x2-x,2) + Math.pow(y2-y, 2) > Math.pow(r, 2)) {
					check2 = true;
				}
				
				if((check1==true && check2==false) || (check1==false && check2==true)) {
					count++;
				}
			}
			bw.write(String.valueOf(count)+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
