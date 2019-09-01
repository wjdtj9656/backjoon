import java.io.*;
import java.util.*;

/*
 * backjoon 4344 problem
 * 첫째 줄에 테스트 케이스 개수가 주어지고
 * 둘째줄은 학생수 + 학생점수들을 입력 받은후
 * 그 줄의 학생들 중 평균을 넘은 학생이 몇퍼센트인지 알려주는 프로그램.
 * https://www.acmicpc.net/problem/4344
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		int j=0;
		int avg=0;
		float count=0;
		float per=0;
		for(i=0;i<num;i++){
			int num2=sc.nextInt();
			int allNum[]=new int[num2];
			
			for(j=0;j<num2;j++){
				allNum[j]=sc.nextInt();
				avg+=allNum[j];
			}
			avg/=num2;
			for(j=0;j<num2;j++){
				if(allNum[j]>avg)
					count++;
			}
			per=count/num2*100;
			System.out.printf("%.3f",per);
			System.out.println("%");
			avg=0;
			count=0;
		}//first for
		
	
		
}//main
}//class main
