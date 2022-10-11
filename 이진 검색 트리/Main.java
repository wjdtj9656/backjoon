import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class Main {
	static int tree[] = new int[10001];
	static void postOrder(int n, int end) {
		if(n > end) return;
		int mid = n+1;
		while(mid <= end && tree[mid] < tree[n]) mid++;
		postOrder(n+1,mid-1);
		postOrder(mid,end);
		System.out.println(tree[n]);
	}
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = 0;
		
		while(true) {
			String num = br.readLine();
			if(num == null || num.equals("")) break;
			tree[index++] = Integer.parseInt(num);
		}
		postOrder(0, index-1);
		br.close();
	}
}