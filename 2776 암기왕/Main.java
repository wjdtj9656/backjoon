package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	2776 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> hs = new HashSet<>();
		
		int testcase = Integer.parseInt(br.readLine());
		hs.clear();
		for(int i=0; i<testcase; i++) {
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<num; j++) {
				hs.add(Integer.parseInt(st.nextToken()));
			}
			
			num = Integer.parseInt(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j=0; j<num; j++) {
				if(hs.contains(Integer.parseInt(st2.nextToken()))) {
					bw.write(String.valueOf(1)+"\n");
				}
				else {
					bw.write(String.valueOf(0)+"\n");
				}
			}

			bw.flush();
		}
		bw.close();
	}
	
}
