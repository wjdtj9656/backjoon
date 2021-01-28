package javaBaekjoon;
import java.io.*;
import java.math.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String rec1=br.readLine();
		String rec2=br.readLine();
		BigInteger num1 = new BigInteger(rec1);
		BigInteger num2 = new BigInteger(rec2);
		bw.write(String.valueOf(num1.add(num2))+"\n");
		bw.write(String.valueOf(num1.subtract(num2))+"\n");
		bw.write(String.valueOf(num1.multiply(num2))+"\n");
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
