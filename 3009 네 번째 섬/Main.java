package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 3009 problem
	*/

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[][] = new int[3][3];
		int x,y;
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//x
		if(arr[0][0] == arr[1][0]) {
			x = arr[2][0];
		}
		else if(arr[0][0] == arr[2][0]) {
			x = arr[1][0];
		}
		else {
			x = arr[0][0];
		}
		
		//y
		if(arr[0][1] == arr[1][1]) {
			y = arr[2][1];
		}
		else if(arr[0][1] == arr[2][1]) {
			y = arr[1][1];
		}
		else {
			y = arr[0][1];
		}
		
		bw.write(x+" "+y);
		bw.flush();
		br.close();
		bw.close();
	}
}
