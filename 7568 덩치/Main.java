package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 7568 problem
	*/

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int arr[][] = new int[num][2];
		int rank;
		for(int i=0; i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<num; i++) {
			rank = 1;
			for(int j=0; j<num; j++) {
				if(i==j) continue;
				
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					rank++;
				}
			}

			bw.write(String.valueOf(rank)+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
