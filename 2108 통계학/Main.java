package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 2108 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		
		//ЦђБе
		double result = 0;
		for(int i=0; i<N; i++) {
			result += list.get(i);
		}

		bw.write(String.format("%.0f", result/N)+"\n");
		if(N %2==0) {
			bw.write(String.valueOf(list.get(N/2)+list.get(list.size()/2-1))+"\n");
		}
		else {
			bw.write(String.valueOf(list.get(list.size()/2))+"\n");
		}
		int max = -5000;
		int result2 = 0;
		int arr[] = new int[8001];
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=0; i<N; i++) {
			arr[list.get(i)+4000]++;
		}
		for(int i=0; i<=8000; i++) {
			if(max < arr[i]) {
				max = arr[i];
				result2 = i;
			}
		}
		for(int i=0; i<=8000; i++) {
			if(max == arr[i]) {
				list2.add(i-4000);
			}
		}
		if(list2.size()==1) {
			bw.write(String.valueOf(list2.get(0))+"\n");
		}else {
			Collections.sort(list2);
			bw.write(String.valueOf(list2.get(1))+"\n");
		}
		bw.write(String.valueOf(list.get(N-1) -list.get(0)));
		
		bw.flush();
		br.close();
		bw.close();
	}
}
