package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	hashmap test
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String,Integer> hsm = new HashMap<>();
		
		int testcase = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<testcase; i++) {
			int num = Integer.parseInt(br.readLine());
			int result = 1;
			for(int j=0; j<num; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();//의류 이름
				String kind = st.nextToken(); //의류 종류
				
				if(hsm.containsKey(kind)) {
					hsm.put(kind, hsm.get(kind)+1);
				}
				else {
					hsm.put(kind,1);
				}
			}
			Iterator<String> it =hsm.keySet().iterator();
			for(int k=0; k<hsm.size(); k++) {
				String key = it.next();
				result *= (hsm.get(key)+1);
			}
			bw.write(String.valueOf(result-1)+"\n");
			hsm.clear();
		}
		
		
		
		bw.flush();
		bw.close();
	}
	
}
