package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1181 problem
	*/

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			//if(!list.contains(str))
			list.add(str);
		}
		int size = list.size();
		
		Collections.sort(list,new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length())
					return 1;
				else if(s1.length() < s2.length())
					return -1;
				else
					return s1.compareTo(s2);
			}
		});	
		for(int i=0; i<size; i++) {
			bw.write(list.get(i)+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
