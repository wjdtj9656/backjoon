package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11728 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int aSize = Integer.parseInt(st.nextToken());
		int bSize = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<aSize; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<bSize; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i)+" ");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
