import java.util.*;
/* 11006 problem
 *������� ��ϴ� �����̴� ���� ���忡�� �ް��� �����ذ���. ��� �� ���忡 ������ �Ϻ� ���� �ٸ��� �ϳ��� �������. 
 *�����̴� �󸶳� ���� �ߵ��� �� �ٸ��� �Ҿ����� �˰�;����� ���� �ʹ� ���� �� �� ������, ��� ��� ���� �ٸ����� �ô�. 
 *����ϴ� �����̸� ���� ��� ���� �ٸ����� �հ� ���� ���� ������ �̰��� �ذ�������.
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