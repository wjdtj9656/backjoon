package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 4153 problem
	*/

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.clear();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			//하나라도 0이면 종료
			if(a==0) {
				break;
			}
			
			list.add(a);
			list.add(b);
			list.add(c);
			Collections.sort(list);
			
			if(list.get(0)*list.get(0)+list.get(1)*list.get(1) == list.get(2)*list.get(2)) {
				bw.write("right"+"\n");
			}
			else {
				bw.write("wrong"+"\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
