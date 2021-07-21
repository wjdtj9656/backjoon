package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 11931 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list,Collections.reverseOrder());
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bw.write(String.valueOf(it.next())+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}

