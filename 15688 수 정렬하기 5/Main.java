import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
public class Main { 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder(); int n = Integer.parseInt(br.readLine()); 
		int[] num = new int[n]; 
		for (int i=0; i<n; i++) num[i] = Integer.parseInt(br.readLine()); 
		Arrays.sort(num); 
		for (int i : num) sb.append(i+"\n"); 
		System.out.print(sb); 
		}
	}
