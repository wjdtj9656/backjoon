package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11653 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int max = 0;
		int result = 0;
		int save[] = new int[5];
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(max < list2.get(j)) {
					max = list2.get(j);
					save[i] = j;
				}
			}
			result += (list2.get(save[i])*list.get(i));
			list2.set(save[i], 0);
			max = 0;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}
}
