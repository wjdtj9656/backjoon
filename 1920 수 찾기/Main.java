package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1920 problem
	*/
	static ArrayList<Integer> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		list = new ArrayList<>();
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<num; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		int num2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<num2; i++) {
			int s = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(binarySearch(list,s)+"\n"));
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	static int binarySearch(ArrayList<Integer> lists,int num) {
		int left = 0;
		int right = list.size()-1;
		int mid = 0;
		
		while(left<=right) {
			mid = (left + right) / 2;
			if(list.get(mid)==num) return 1;
			
			else if(list.get(mid)>num) right = mid-1;
			else if(list.get(mid)<num) left = mid +1;
		}
		return 0;
	}
}
