import java.util.*;
/* 2851 problem
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
 * 이들 소수의 합은 620이고, 최솟값은 61이 된다.
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