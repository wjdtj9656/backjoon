package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 5337 problem
	Welcome을 예제 출력처럼 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String first = ".  .   .";
		String second = "|  | _ | _. _ ._ _  _";
		String third = "|/\\|(/.|(_.(_)[ | )(/.";
		
		bw.write(first +"\n");
		bw.write(second +"\n");
		bw.write(third +"\n");
		
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
