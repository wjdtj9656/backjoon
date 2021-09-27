import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

class Main {
	
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		System.out.println(simple.format(d));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}