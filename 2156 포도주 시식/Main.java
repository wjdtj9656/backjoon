package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 2156 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> dp = new ArrayList<>();
		int max = 0;
		for(int i=0; i<num; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		dp.add(0);
		dp.add(arr.get(0));
		if(num>=2)
		dp.add(arr.get(0)+arr.get(1));
		for(int i=3; i<num+1; i++) {
			dp.add(Math.max(dp.get(i-1), Math.max(arr.get(i-1)+arr.get(i-2)+dp.get(i-3), dp.get(i-2)+arr.get(i-1))));
		}
		
		for(int i=0; i<=num; i++) {
			if(max<dp.get(i)) {
				max = dp.get(i);
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}
	
}
