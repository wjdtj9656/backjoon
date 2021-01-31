package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 8370 problem
	Byteland Airlines recently extended their aircraft fleet with a new model of a plane. The new acquisition has n1 rows of seats in the business class and n2 rows in the economic class. In the business class each row contains k1 seats, while each row in the economic class has k2 seats.
	Write a program which:
	reads information about available seats in the plane,
	calculates the sum of all seats available in that plane,
	writes the result.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		String[] seats = num.split(" ");
		int sum = 0;
		sum = Integer.parseInt(seats[0]) * Integer.parseInt(seats[1]) + Integer.parseInt(seats[2]) * Integer.parseInt(seats[3]);
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
