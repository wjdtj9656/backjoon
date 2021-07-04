package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1181 problem
	*/

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		int arr[][] = new int[num][2];
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr,new Comparator<int[]>(){
			public int compare(int[] a1,int[] a2) {
				if(a1[0]>a2[0]) {
					return 1;
				}
				else if(a1[0]<a2[0]){
					return -1;
				}
				else {
					return a1[1]-a2[1];
				}
			}
		});
		for(int i=0; i<num;i++) {
		bw.write(String.valueOf(arr[i][0]+" "+arr[i][1]+"\n"));
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
