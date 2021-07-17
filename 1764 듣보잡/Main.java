package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 1764 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			hs.add(br.readLine());
		}
		for(int i=0; i<M; i++) {
			String s = br.readLine();
			if(hs.contains(s)) {
				list.add(s);
			}
		}
		bw.write(String.valueOf(list.size()+"\n"));
		
		Collections.sort(list);
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			bw.write(String.valueOf(it.next())+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}

