import java.util.*;
import java.io.*;

public class Main {
	static int arr[];
	public static long getSize(int lo, int hi) {
		if(lo == hi) {
			return arr[lo];
		}
		int mid = (lo + hi)/2;
		long leftSize = getSize(lo, mid);
		long rightSize = getSize(mid+1, hi);
		long max = Math.max(leftSize, rightSize);
		max = Math.max(max, getMidSize(lo,hi,mid));
		return max;
	}
	public static long getMidSize(int lo, int hi, int mid) {
		int leftIndex = mid;
		int rightIndex = mid;
		long height = arr[mid];
		long max = height;
		while(lo < leftIndex && rightIndex < hi) {
			if(arr[leftIndex-1] < arr[rightIndex+1]) {
				rightIndex++;
				height = Math.min(arr[rightIndex], height);
			}else {
				leftIndex--;
				height = Math.min(arr[leftIndex], height);
			}
			max = Math.max(max, height * (rightIndex - leftIndex +1));
		}
		while(rightIndex < hi) {
			rightIndex++;
			height = Math.min(height, arr[rightIndex]);
			max = Math.max(max, height * (rightIndex - leftIndex +1));
		}
		while(lo < leftIndex) {
			leftIndex--;
			height = Math.min(height, arr[leftIndex]);
			max = Math.max(max, height *(rightIndex - leftIndex +1));
		}
		return max;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		long max = getSize(1,N);
		System.out.println(max);
	}
}