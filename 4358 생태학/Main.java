package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 4358 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		TreeMap<String,Integer> hsm = new TreeMap<>();
		int count = 0;
		
		//입력받은 값 개수 세주고 값 넣어주기
		while(true) {
			String str = br.readLine();
			if(str==null || str.equals("")) {
				break;
			}
			count++;
			if(hsm.containsKey(str)) {
				hsm.put(str, hsm.get(str)+1);
			}
			else {
				hsm.put(str,1);
			}
		}
		//총 개수로 나누어서 출력
		Iterator it = hsm.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			double value = (double) (hsm.get(key)*100.0)/count;
			bw.write(key+" "+String.format("%.4f", value)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
