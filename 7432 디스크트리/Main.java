import java.util.*;
import java.io.*;
class Node{
	String s;
	HashMap<String, Node> childNodes = new HashMap<>();
	public void insert(String str) {
		Node node = this;
		StringTokenizer st = new StringTokenizer(str,"\\");
		ArrayList<String> list = new ArrayList<>();
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		for(String s : list) {
			node.childNodes.putIfAbsent(s, new Node());
			node = node.childNodes.get(s);
		}
	}
	public void print(Node node, int depth) {
		Node cur = node;
		if(cur.childNodes != null) {
			ArrayList<String> list = new ArrayList<>(cur.childNodes.keySet());
			Collections.sort(list);
			for(String s : list) {
				for(int i=0; i<depth; i++) {
					System.out.print(" ");
				}
				System.out.println(s);
				print(node.childNodes.get(s),depth+1);
			}
			
		}
	}
}
public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Node node = new Node();
		for(int i=0; i<N; i++) {
			node.insert(br.readLine());
		}
		node.print(node,0);
		br.close();
	}
}
