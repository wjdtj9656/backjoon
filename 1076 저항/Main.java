import java.util.*;
import java.util.stream.IntStream;
import java.awt.Point;
import java.io.*;
	
	class Main {
		static String first,second,third;
		public static int insertValue(String s) {
			if(s.equals("black")) return 0;
			else if(s.equals("brown")) return 1;
			else if(s.equals("red")) return 2;
			else if(s.equals("orange")) return 3;
			else if(s.equals("yellow")) return 4;
			else if(s.equals("green")) return 5;
			else if(s.equals("blue")) return 6;
			else if(s.equals("violet")) return 7;
			else if(s.equals("grey")) return 8;
			else return 9;
		}
		public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	first = br.readLine();
	    	second = br.readLine();
	    	third = br.readLine();
	    	int firstInt,secondInt;
	    	long thirdInt;
	    	firstInt = insertValue(first);
	    	secondInt = insertValue(second);
	    	thirdInt = (long) Math.pow(10, insertValue(third));
	    	first = String.valueOf(firstInt);
	    	second = String.valueOf(secondInt);
	    	bw.write(String.valueOf( Integer.parseInt((first+second))* thirdInt));
	    	
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}