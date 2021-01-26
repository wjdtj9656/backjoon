package javaBaekjoon;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num2 = new String[2]; 
		num2 = br.readLine().split(" ");
		BigInteger receivedPeople = new BigInteger(num2[0]);
		BigInteger balance = new BigInteger(num2[1]);
		bw.write(receivedPeople.divide(balance) +"\n" + receivedPeople.remainder(balance));
		bw.flush();
		bw.close();
		
		return ;
	}

}
