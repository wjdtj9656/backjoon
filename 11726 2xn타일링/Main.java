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
		arr.add(1);
		arr.add(2);
		if(num>2)
		for(int i=2;i<num;i++) {
			arr.add((arr.get(i-1)+arr.get(i-2))%10007);
		}
		
		bw.write(String.valueOf(arr.get(num-1)));
		bw.flush();
		bw.close();
	}
	
}
