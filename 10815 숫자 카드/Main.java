package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 1764 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int arr2[] = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
			for(int i=0; i<M; i++) {
				int start = 0;
				int end = N-1;
				int mid = (N-1)/2;
				int check = 0;
				
				while(start<=end) {
				if(arr[mid] == arr2[i]) {
					check++;
					bw.write(String.valueOf(1)+" ");
					break;
				}
				else if(arr[mid] < arr2[i]) {
					start = mid+1;
				}
				else if(arr[mid] > arr2[i]) {
					end = mid-1;
				}
				mid = (start+end)/2;
				}
				
				if(check != 1) bw.write(String.valueOf(0)+" ");
			}
		
		bw.flush();
		br.close();
		bw.close();
	}
}

