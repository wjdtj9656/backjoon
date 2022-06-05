import java.util.*;
import java.io.*;
class TreeNode{
	int val;
//	TreeNode left;
//	TreeNode right;
	List<TreeNode> children = new ArrayList<>();
	TreeNode prev;
	public TreeNode(int val) {
		this.val = val;
	}
}
public class Main {
	static TreeNode cur;
	static TreeNode res;
	static public boolean recurTree(TreeNode cur, TreeNode p ,TreeNode q) {
		if(cur == null) return false;
		int childSize = cur.children.size();
		int num = 0;
		for(int i=0; i<childSize; i++) {
			num += recurTree(cur.children.get(i), p, q)? 1:0;
		}
		int mid = (cur == p || cur == q)?1:0;
		if(num+mid >= 2) {
			res = cur;
		}
		return (num+mid > 0);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		TreeNode p = null;
		TreeNode q = null;
		TreeNode root = new TreeNode(1);
		TreeNode arr[] = new TreeNode[s.length()+1];
		cur = root;
		res = root;
		
		int index = 2;
		arr[1] = root;
		
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == '0') {
				cur.children.add(new TreeNode(index++));
				arr[i+1] = cur.children.get(cur.children.size()-1);
				arr[i+1].prev = cur;
				cur = arr[i+1];
			}
			else {
				arr[i+1] = cur;
				cur = cur.prev;
			}
		}
		StringBuilder sb = new StringBuilder();
		p = arr[x];
		q = arr[y];
		if(p==q) res = p;
		else recurTree(root, p, q);
		for(int i=1; i<arr.length; i++) {
			if(arr[i].val == res.val ) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}