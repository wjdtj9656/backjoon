package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 10825 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String arr[][] = new String[num][4];
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				arr[i][j] = st.nextToken();
			}
		}
		Arrays.sort(arr, new Comparator<String[]>() {
			
			public int compare(String[] s1, String[] s2) {
				if(Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
					if(Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
						if(Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
							return s1[0].compareTo(s2[0]);
						}
				return Integer.parseInt(s2[3])-Integer.parseInt(s1[3]);
					}
					return Integer.parseInt(s1[2])-Integer.parseInt(s2[2]);
			}
				return Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
			}
		});
		for(String[] i : arr) {
			bw.write(i[0]+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}

