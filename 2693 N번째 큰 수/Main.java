package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 2693 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<10; j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
			bw.write(String.valueOf(list.get(7)+"\n"));
			list.clear();
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
