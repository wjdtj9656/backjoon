package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 16165 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(4);
		for(int i=3;i<11;i++) {
			arr.add(arr.get(i-1)+arr.get(i-2)+arr.get(i-3));
		}
		for(int i=0; i<testcase; i++) {
			int num = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(arr.get(num-1))+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
