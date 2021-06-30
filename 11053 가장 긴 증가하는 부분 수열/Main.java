package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11053 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = 0;
		for(int i=0; i<num; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		result.add(1);
		
		for(int i=1; i<num; i++) {
			result.add(1);
			for(int j=0; j<i; j++) {
				if(arr.get(i)>arr.get(j) && result.get(j)>=result.get(i)) {
					result.set(i,result.get(j)+1);
				}
			}
		}
		
		for(int i=0; i<result.size(); i++) {
			if(max<result.get(i)) {
				max = result.get(i);
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}
	
}
