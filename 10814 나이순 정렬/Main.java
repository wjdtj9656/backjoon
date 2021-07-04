package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 10814 problem
	*/
	static int arr[][];
	static int min=64;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String arr[][] = new String[num][2];
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		Arrays.sort(arr,new Comparator<String[]>() {
			public int compare(String[] s1, String[] s2) {
				if(Integer.parseInt(s1[0])<Integer.parseInt(s2[0])) {
					return -1;
				}
				else if(Integer.parseInt(s1[0])>Integer.parseInt(s2[0])) {
					return 1;
				}
				else {
					return 0;
				}
			}
		});
		
		for(int i=0; i<num; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
