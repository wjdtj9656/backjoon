import java.io.*;
import java.util.*;

/*
 * backjoon 3052 problem
 * 10가지 수를 42로 나눈 후 나머지 값 다른 수가 몇개인지?
 * https://www.acmicpc.net/problem/3052
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num[]=new int[10];
		int count=1;
		
		for(int i=0;i<10;i++){
			num[i]=Integer.parseInt(br.readLine());
			num[i]%=42;
		}
		Arrays.sort(num);
		for(int i=0;i<9;i++){
				if(num[i]!=num[i+1]){
					count ++;
				}
		}
		bw.write(count+"\n");
		bw.flush();
		bw.close();
}//main
}//class main
