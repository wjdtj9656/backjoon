package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 2822 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<>();
		int max = 0;
		int sum = 0;
		int save[] = new int[5];
		int temp = 0;
		for(int i=0; i<8; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		for(int j=0; j<5; j++) {
		for(int i=0; i<8; i++) {
			if(max < list.get(i)) {
				max = list.get(i);
				temp = i;
			}
		}
		sum += max;
		max = 0;
		save[j] =temp+1;
		list.set(temp, 0);
		}
		bw.write(sum+"\n");
		Arrays.sort(save);
		for(int i=0; i<5; i++) {
			bw.write(save[i]+" ");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
