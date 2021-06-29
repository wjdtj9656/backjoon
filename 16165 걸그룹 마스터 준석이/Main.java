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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String,String> hsm = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
		String team = br.readLine();
		int num = Integer.parseInt(br.readLine());
			for(int j=0; j<num; j++) {
				sb.append(br.readLine()+" ");
			}
			hsm.put(team, sb.toString());
			sb.setLength(0); //stringBuilder 초기화;
		}
		
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			int num = Integer.parseInt(br.readLine());
			arr.clear();
			if(num == 0) {
				StringTokenizer st2 = new StringTokenizer(hsm.get(str)," ");
				while(st2.hasMoreTokens()) {
					arr.add(st2.nextToken());
				}
				Collections.sort(arr);
				for(int j=0; j<arr.size();j++) {
					bw.write(arr.get(j)+"\n");
				}
			}
			else {
				Iterator<String> it = hsm.keySet().iterator();
				while(it.hasNext()) {
					String key = it.next();
					StringTokenizer st3 = new StringTokenizer(hsm.get(key)," ");
			
					
					while(st3.hasMoreTokens()) {
						String strr = st3.nextToken();
						//System.out.println("이건str:" +str);
						//System.out.println("토큰 : "+strr);
						if(str.equals(strr)) {
							bw.write(key+"\n");
						}
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
	
}
