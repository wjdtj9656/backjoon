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
		
		Scanner sc = new Scanner(System.in);
		int ham1 = sc.nextInt();
		int ham2 = sc.nextInt();
		int ham3 = sc.nextInt();
		int bev1 = sc.nextInt();
		int bev2 = sc.nextInt();
		
		int sum = 0;
		int[] ham = new int[3];
		ham[0] = ham1;
		ham[1] = ham2;
		ham[2] = ham3;
		int[] bev = new int[2];
		bev[0] = bev1;
		bev[1] = bev2;
		sum = min(ham) + min(bev) - 50;
		
		System.out.println(sum);
		return ;
	}

	static int min(int a[]) {
		int min = a[0];
		for(int i=0; i<a.length-1; i++) {
			if(min > a[i+1]) {
				min = a[i+1];
			}
		}
		return min;
	}
}
