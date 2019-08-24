
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2[]=new int[num];
	for(int i=1;i<num2.length+1;i++){
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Case #"+i+": "+(a+b));
	}
}//main
}//class main
