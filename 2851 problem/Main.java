import java.util.*;
/* 2851 problem
 * �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 �� 8���� �����Ƿ�, 
 * �̵� �Ҽ��� ���� 620�̰�, �ּڰ��� 61�� �ȴ�.
 * https://www.acmicpc.net/problem/2581
 */
public class Main {

	
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int num1=sc.nextInt();
    	int num2=sc.nextInt();
    	int count=0,scount=0,sum=0;
    	int min=num2;
    	for(int i=num1;i<=num2;i++){
    		
    		scount=0;
    		for(int j=1;j<=i;j++){
    			if(i%j==0)
    				scount++;   			
    		}
    		if(scount==2){
    			count++;
    			sum+=i;
    			if(min>i)
    				min=i;
    		}
    	}
    	if(sum>0){
    	System.out.println(sum);
    	System.out.println(min);
    	}
    	else{
    		System.out.println(-1);
    	}
    
    }//main
   
}//class