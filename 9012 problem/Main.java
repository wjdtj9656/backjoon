import java.util.*;
/* 9012 problem
 * ��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. 
 * �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���.
 *  ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�. �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�. 
 *  ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
 *  �������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
 * https://www.acmicpc.net/problem/9012
 */
public class Main {

	
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    
    	for(int j=0;j<num;j++){
    		String vps=sc.next();
        	char[] array_vps=new char[vps.length()];
        	int sum=0;
        	
    	for(int i=0;i<array_vps.length;i++){
    		array_vps[i]=(vps.charAt(i));
    			if(array_vps[i]=='(') sum++;
    			else if(array_vps[i]==')') sum--;
    		if(sum<0){//)(����
    			System.out.println("NO");
    			break;
    		}  
    	}
    		if(sum==0)  System.out.println("YES");
    		else if(sum>0)	System.out.println("NO");    	
    	}   	
    }//main
}//class