package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 3046 problem
	�� ���� R1�� R2�� ���� ��, �� ���� ��� S�� (R1+R2)/2�� ����. ����̴� ������ ���� ������ �� ���� R1�� R2�� �ַ��� �Ѵ�. ���� ��Ƽ���� ����̴� �����̿��� �� �� ���ڸ� �����ְ�, �����̴� �� ���ڸ� �޾� ���´�. �׸��� ���� ��� �������� 1�⵿�� �� ���ڸ� �ܿ�鼭 ���.
	����̴� R1�� R2�� ��û�� ��� ���� ���ߴ�. �۳⿡�� R1�� R2�� ��Ծ �ƹ� ���ڳ� ���ؼ� �־��� ������, ���ش� ����� �ʱ� ���ؼ� ��� S�� ���� ����Ϸ��� �Ѵ�.
	������ ������ �����̴�. 5�� �Ŀ� ����̴� ���� ������ �� ���� R1�� R2�� �����־�� ������, ��Ÿ���Ե� R2�� ��԰� ���Ҵ�. ������ R1�� S�� ����ϰ� �ִ�!
	����̸� ���� R2�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		String [] rememNum = num.split(" ");
		int result = Integer.parseInt(rememNum[1])*2 - Integer.parseInt(rememNum[0]);
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
