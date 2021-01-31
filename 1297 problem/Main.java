package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 1297 problem
	김탑은 TV를 사러 인터넷 쇼핑몰에 들어갔다. 쇼핑을 하던 중에, TV의 크기는 그 TV의 대각선의 길이로 나타낸 다는 것을 알았다. 하지만, 김탑은 대각선의 길이가 같다고 해도, 실제 TV의 크기는 다를 수도 있다는 사실에 직접 TV를 보러갈걸 왜 인터넷 쇼핑을 대각선의 길이만 보고있는지 후회하고 있었다.
	인터넷 쇼핑몰 관리자에게 이메일을 보내서 실제 높이와 실제 너비를 보내달라고 했지만, 관리자는 실제 높이와 실제 너비를 보내지 않고 그것의 비율을 보내왔다.
	TV의 대각선 길이와, 높이 너비의 비율이 주어졌을 때, 실제 높이와 너비의 길이를 출력하는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		String measures[] = num.split(" ");
		double dig =Integer.parseInt(measures[0]);
		int height = Integer.parseInt(measures[1]);
		int weigh = Integer.parseInt(measures[2]);
		double k = Math.pow(dig, 2)/(Math.pow(height, 2) + Math.pow(weigh, 2));
		k = Math.sqrt(k);
		height = (int) (k*height);
		weigh = (int) (k*weigh);
		bw.write(height+" "+weigh);
		bw.flush();
		bw.close();
		return ;
	}

}
