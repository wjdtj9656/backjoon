package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 2805 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int treeNum = Integer.parseInt(st.nextToken());
		int needTree = Integer.parseInt(st.nextToken());
		int max = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		//리스트에 나무 길이들 넣기
		for(int i=0; i<treeNum; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		//나무들중 제일 긴 나무찾기
		for(int i=0; i<treeNum; i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		//탐색
		long start = 0;
		long end = max;
		long mid = 0;
		
		while(start <= end) {
			long sum = 0;
			mid = (start+end)/2;
			for(int i=0; i<treeNum; i++) {
				if(list.get(i) > mid)
					sum += list.get(i) - mid;
			}
			if(sum >= needTree) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			
		}
		
		
		bw.write(String.valueOf(end));
		bw.flush();
		br.close();
		bw.close();
	}
}
