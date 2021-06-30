package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 14501 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		int max = -1000;
		
		for(int i=0; i<num; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		result.add(arr.get(0));
		for(int i=1; i<num; i++) {
			
			result.add(i, Math.max(result.get(i-1)+arr.get(i), arr.get(i)));
			
		}
		
		for(int i=0; i<num; i++) {
			max = Math.max(max, result.get(i));
		}
		bw.write(String.valueOf(max));
		
		bw.flush();
		bw.close();
	}
	
}
