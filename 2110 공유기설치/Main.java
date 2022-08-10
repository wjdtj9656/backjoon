import java.util.*;
import java.io.*;

public class Main {
	static int arr[];
	public static boolean canInstall(int num, int cnt) {
		for(int i=0, index=0; i<arr.length-1; i++) {
			if(arr[i+1] - arr[index] < num) continue;
			else {
				cnt--;
				index = i+1;
			}
		}
		if(cnt > 0) return true;
		else return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		int start = 1;
		int end = arr[N-1];
		int mid = 0;
		Arrays.sort(arr);
		while(start<end) {
			mid = (start+end)/2;
			if(canInstall(mid,C-1)) {
				end = mid;
			}
			else {
				start = mid+1;
			}
		}
		System.out.println(start-1);
		br.close();
	}
}