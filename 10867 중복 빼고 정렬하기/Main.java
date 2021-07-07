package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 10867 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TreeSet<Integer> hs = new TreeSet<>();
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			hs.add(Integer.parseInt(st.nextToken()));
		}
	
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			bw.write(it.next()+" ");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
