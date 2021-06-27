package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1620 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String,String> hsm = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		//해쉬맵에 값넣기
		for(int i=0; i<N; i++) {
			String key = br.readLine();
			hsm.put(key,String.valueOf(i+1));
			hsm.put(String.valueOf(i+1), key);
		}
		//key값으로 value가져오기
		for(int i=0; i<M; i++) {
			String input = br.readLine();
			
			if(hsm.containsKey(input)) {
				bw.write(hsm.get(input)+"\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
	
}
