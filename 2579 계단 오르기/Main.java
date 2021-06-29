package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11726 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		result.add(0);
		result.add(arr.get(0));
		if(num>=2)
		result.add(arr.get(0)+arr.get(1));
		
		for(int i=3;i<=num;i++) {
			result.add(Math.max(result.get(i-3)+arr.get(i-2)+arr.get(i-1), result.get(i-2)+arr.get(i-1) ));
		}
		bw.write(String.valueOf(result.get(num)));
		bw.flush();
		bw.close();
	}
	
}
