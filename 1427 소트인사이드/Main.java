	package javaBaekjoon;
	import java.awt.desktop.SystemEventListener;
	import java.io.*;
	import java.math.*;
	import java.util.*;
	
	public class Main {
	
		/*
	 	2161 problem 카드1
		*/
		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			ArrayList<Integer> list = new ArrayList<>();
			
			int num = Integer.parseInt(br.readLine());
			int changeNum = 0;
			int index_size = num;
			
			//0이 아니라 1부터 시작
			for(int i=1; i<num+1; i++) {
				list.add(i);
			}
			//0.index_size를 검사하여 현재 몇개의 숫자가 리스트에 들어있는지 확인(1개이하면 출력후 반복문 종료)
			//1.제일 위에 있는값을 출력하고
			//2.제거해주고
			//3.현재 제일 위의 값을 저장 한 후
			//4.(3)과정에서 저장한 값을 제일 밑으로 보낸후 값이 하나 줄었으므로 인덱스 사이즈 하나 줄인후, 밑으로 옮겼던값 위에서 제거
			for(int i=0; i<num; i++) {

				if(index_size<=1) {
					bw.write(String.valueOf(list.get(0)));
					break;
				}
				bw.write(String.valueOf(list.get(0))+" ");
				list.remove(0);
				changeNum = list.get(0);
				
				list.add(index_size-1,changeNum);
				index_size--;
				list.remove(0);
			}
			
			bw.flush();
			bw.close();
		}
	}
