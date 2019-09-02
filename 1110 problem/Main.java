import java.io.*;
import java.util.*;

/*
 * backjoon 1110 problem
 * 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
 * �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�.
 * ���� ���� ����.
 * 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. 
 * ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
 * ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
 * N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * https://www.acmicpc.net/problem/1110
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=num;
		int count=0;
		if(num<10){
			num=num%10+num/10; // ���ڸ� �� �϶� %10 �ϸ� �����ڸ� /10 �ϸ� �����ڸ�
		}
		do{
			if(num%10+10<10){
				num=num%10*10+num%10+num/10;
				count++;
			}
			else{
				num=num%10*10+(num%10+num/10)%10;
				count++;
			}
			
		}while(num!=num2);
		
		System.out.println(count);
		
	
		
}//main
}//class main
