package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1158 problem 요세푸스
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		//리스트에 값넣기
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		bw.write("<");
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<k-1; j++) {
			list.add(list.get(0));
			list.remove(0);
			}
			//마지막엔 "," 빼야하므로 넣은부분
			if(i==N-1) {
				bw.write(String.valueOf(list.get(0)));
				list.remove(0);
				break;
			}
			bw.write(String.valueOf(list.get(0))+", ");
			list.remove(0);
		}
		
			bw.write(">");
		
		bw.flush();
		bw.close();
	}
}
