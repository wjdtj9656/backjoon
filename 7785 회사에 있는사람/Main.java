package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	10829 problem ������ ��ȯ
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
			
			//enter�� �ؽ��¿� ���ֱ�
			if(com.equals("enter")) {
				set.add(name);
			}
			//enter�� �ƴϸ� leave�̹Ƿ� �ؽ����� ����
			else {
				set.remove(name);
			}
		}
		
		//����Ʈ�� �ؽ��� �ֱ�
		Iterator it = set.iterator();
		while(it.hasNext()) {
			arr.add((String) it.next());
		}
		
		//�迭 ���� ����
		arr.sort(Collections.reverseOrder());
		
		//�������� ������ �迭�� ���
		for(int i=0; i<arr.size();i++) {
			bw.write(arr.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
