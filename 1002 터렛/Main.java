package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1002 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			
			int distance = (int)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

			if(distance == 0 && r1==r2) {
				bw.write(String.valueOf(-1)+"\n");
			}
			else if (distance > r1+r2 || distance < Math.abs(r1-r2) || distance == 0) {
				bw.write(String.valueOf(0)+"\n");
			}
			else if(distance == r1+r2 ||  (distance==Math.abs(r1-r2))) {
				bw.write(String.valueOf(1)+"\n");
			}
			else {
				bw.write(String.valueOf(2)+"\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
