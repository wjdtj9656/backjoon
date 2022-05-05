import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
//		Stack<Integer> stack2 = new Stack<>();
		//-1 ==> (
		//-2 ==> {
		String s = br.readLine();
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);

			if (stack.empty()) {
				if(temp == '(') stack.add(-1);
				else if(temp == '[') stack.add(-2);
				else {
					break;
				}
			} else {
				if (temp == ')') {
					if (stack.peek() == -1) {
						stack.pop();
						stack.add(2);
					} else {
						int sum = 0;
						if(!stack.contains(-1)) {
							stack.clear();
							break;
						}
						while (stack.peek() != -1) {
							sum += stack.pop();
						}
						stack.pop();
						sum *= 2;
						stack.add(sum);
					}
				} else if (temp == ']') {
					if (stack.peek() == -2) {
						stack.pop();
						stack.add(3);
					} else {
						int sum = 0;
						if(!stack.contains(-2)) {
							stack.clear();
							break;
						}
						while (stack.peek() != -2) {
							sum += stack.pop();
						}
						stack.pop();
						sum *= 3;
						stack.add(sum);
					}
				} else {
					if(temp == '(') stack.add(-1);
					else if(temp == '[') stack.add(-2);
				}

			}
		}
		//System.out.println(stack);
		while(!stack.empty()) {
			int popNum = stack.pop();
			if(popNum == -1 || popNum == -2 ) {
				result = 0;
				break;
			}
			else {
				result += popNum;
			}
		}
		System.out.println(result<0 ? 0 : result);
	}
}