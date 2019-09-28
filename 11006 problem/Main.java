import java.util.*;
/* 11006 problem
 *계란집을 운영하는 남욱이는 매일 닭장에서 달걀을 수거해간다. 어느 날 닭장에 들어가보니 일부 닭의 다리가 하나씩 사라졌다. 
 *남욱이는 얼마나 많은 닭들이 한 다리를 잃었는지 알고싶었지만 닭이 너무 많아 셀 수 없었고, 대신 모든 닭의 다리수를 셌다. 
 *고민하는 남욱이를 위해 모든 닭의 다리수의 합과 닭의 수를 가지고 이것을 해결해주자.
 * https://www.acmicpc.net/problem/11006
 */
public class Main {

	
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	for(int i=0;i<num;i++){
    		int numleg=sc.nextInt();
    		int chicken=sc.nextInt();
    		int disLeg=chicken*2-numleg;
    		System.out.print(disLeg+" ");
    		System.out.println(chicken-disLeg);
    	}    		
    }//main
}//class