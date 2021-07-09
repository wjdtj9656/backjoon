package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11727 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		for(int i=2; i<=num; i++) {
			list.add((list.get(i-1) + 2*list.get(i-2))%10007);
		}
		bw.write(String.valueOf(list.get(num)));
		
		bw.flush();
		br.close();
		bw.close();
	}
}
