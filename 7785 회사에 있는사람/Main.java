package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	10829 problem 이진수 변환
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TreeSet<String> set =new TreeSet<>();
		ArrayList<String> arr = new ArrayList<>();
		
		int peopleNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<peopleNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String com = st.nextToken();
			
			//enter면 해쉬셋에 값넣기
			if(com.equals("enter")) {
				set.add(name);
			}
			//enter가 아니면 leave이므로 해쉬에서 빼기
			else {
				set.remove(name);
			}
		}
		
		//리스트에 해쉬값 넣기
		Iterator it = set.iterator();
		while(it.hasNext()) {
			arr.add((String) it.next());
		}
		
		//배열 역순 정렬
		arr.sort(Collections.reverseOrder());
		
		//역순으로 정렬한 배열들 출력
		for(int i=0; i<arr.size();i++) {
			bw.write(arr.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
