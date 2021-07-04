package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11651 problem
	*/
	static int arr[][];
	static int min=64;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int arr[][] = new int[input][2];
		for(int i=0; i<input; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		//정렬
		Arrays.sort(arr,new Comparator<int[]>() {
			public int compare(int[] a1, int[] a2) {
				if(a1[1]>a2[1]) {
					return 1;
				}
				else if(a1[1]<a2[1]) {
					return -1;
				}
				else {
					return a1[0]-a2[0];
				}
			}
		});
		//출력
		for(int i=0; i<input; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
