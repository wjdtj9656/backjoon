package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 8979 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int cer = Integer.parseInt(st.nextToken());
		int arr[][] = new int[num+1][4];
		int rank = 1;
		for(int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[index][0] = g;
			arr[index][1] = s;
			arr[index][2] = b;
		}
		
		for(int i=1; i<=num; i++) {
			if(arr[i][0] > arr[cer][0]) {
				rank++;
			}
			else if(arr[i][0] == arr[cer][0] && arr[i][1] > arr[cer][1]) {
				rank++;
			}
			else if(arr[i][1] == arr[cer][1] && arr[i][2] > arr[cer][2]) {
				rank++;
			}
		}
		bw.write(String.valueOf(rank));
		bw.flush();
		br.close();
		bw.close();
	}
}
