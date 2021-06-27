package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	10816 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<Integer,Integer> hsm = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int key = Integer.parseInt(st.nextToken());
			if(hsm.containsKey(key)) {
				hsm.put(key, hsm.get(key)+1);
			}
			else {
			hsm.put(key, 1);
			}

		}

		int M = Integer.parseInt(br.readLine());

		StringTokenizer st2 =new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			int key = Integer.parseInt(st2.nextToken());
			if(hsm.containsKey(key)) {
				bw.write(hsm.get(key)+" ");
			}
			else {
				bw.write(0+" ");
			}
		}
		
		bw.flush();
		bw.close();
	}
	
}
