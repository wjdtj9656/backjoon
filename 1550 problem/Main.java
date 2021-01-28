package javaBaekjoon;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num16 =br.readLine();
		//System.out.print(Integer.parseInt(num16,16));
		bw.write(String.valueOf(Integer.valueOf(num16,8)));
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
