package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 10250 problem ACMȣ��
	ACM ȣ�� �Ŵ��� ����� �մ��� �����ϴ� ��� �� ���� �����ϰ� �ִ�. �� �������翡 ������ �մԵ��� ȣ�� �������κ��� �ɾ ���� ª�� �Ÿ��� �ִ� ���� ��ȣ�Ѵٰ� �Ѵ�. �������� ���츦 ���� �� ���α׷��� �ۼ��ϰ��� �Ѵ�. �� �������� ��� ��� ȣ�� �������κ��� �ȴ� �Ÿ��� ���� ª���� ���� �����ϴ� ���α׷��� �ۼ��ϰ��� �Ѵ�.
	������ �ܼ�ȭ�ϱ� ���ؼ� ȣ���� ���簢�� ����̶�� ��������. �� ���� W ���� ���� �ִ� H �� �ǹ��̶�� �������� (1 �� H, W �� 99). �׸��� ���������ʹ� ���� ���ʿ� �ִٰ� ��������(�׸� 1 ����). �̷� ������ ȣ���� H �� W ���� ȣ���̶�� �θ���. ȣ�� ������ ���� ���������� �ٷ� �տ� �ִµ�, �������� ���������ͱ����� �Ÿ��� �����Ѵ�. �� ��� ������ �� �� ������ �Ÿ��� ���� �Ÿ�(�Ÿ� 1)��� �����ϰ� ȣ���� ���� �ʿ��� ���� �ִٰ� �����Ѵ�.
	�� ��ȣ�� YXX �� YYXX �����ε� ���⼭ Y �� YY �� �� ���� ��Ÿ���� XX �� ���������Ϳ������� ������ ���� ��ȣ�� ��Ÿ����. ��, �׸� 1 ���� �������� ǥ���� ���� 305 ȣ�� �ȴ�.
	�մ��� ���������͸� Ÿ�� �̵��ϴ� �Ÿ��� �Ű� ���� �ʴ´�. �ٸ� �ȴ� �Ÿ��� ���� ������ �Ʒ����� ���� �� ��ȣ�Ѵ�. ���� ��� 102 ȣ �溸�ٴ� 301 ȣ ���� �� ��ȣ�ϴµ�, 102 ȣ�� �Ÿ� 2 ��ŭ �ɾ�� ������ 301 ȣ�� �Ÿ� 1 ��ŭ�� ������ �Ǳ� �����̴�. ���� ������ 102 ȣ���� 2101 ȣ�� �� ��ȣ�Ѵ�.
	�������� �ۼ��� ���α׷��� �ʱ⿡ ��� ���� ����ִٰ� �����Ͽ� �� ��å�� ���� N ��°�� ������ �մԿ��� ������ �� ��ȣ�� ����ϴ� ���α׷��̴�. ù ��° �մ��� 101 ȣ, �� ��° �մ��� 201 ȣ ��� ���� �����Ѵ�. �׸� 1 �� ��츦 ���� ���, H = 6�̹Ƿ� 10 ��° �մ��� 402 ȣ�� �����ؾ� �Ѵ�.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		String value[] = new String[3];
		for(int i=0; i<num; i++) {
			String values = br.readLine();
			value = values.split(" ");
			result = Integer.parseInt(value[2]) % Integer.parseInt(value[0]);
			if (result == 0) {
				result = Integer.parseInt(value[0]);
				bw.write(result + String.format("%02d", Integer.parseInt(value[2]) / Integer.parseInt(value[0]))+"\n");
			}
			else {
			bw.write(String.valueOf(result));
			
			result = Integer.parseInt(value[2]) / Integer.parseInt(value[0]) + 1;
			
			bw.write(String.format("%02d",result) + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		return ;
	}
}
