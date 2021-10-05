	import java.util.*;
	import java.io.*;
	
	class Main {
		private static boolean isBrace(String temp, String peek) {
			if(temp.equals(peek)) return true;
			return false;
		}
		private static boolean isNumber(String peek) {
			if(peek.equals(")") || peek.equals("]")) return false;
			return true;
		}
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	String s = br.readLine();
	    	Stack<String> stack = new Stack<>();
	    	boolean isAble = true;
	    	for(int i=0; i<s.length(); i++) {
	    	
	    		String temp = s.substring(i,i+1);
	    		
	    		if(temp.equals("(")) {
	    			stack.push(")");
	    			continue;
	    		}
	    		if(temp.equals("[")) {
	    			stack.push("]");
	    			continue;
	    		}
	    		int num = 0;
	    		while(true) {
	    			if(stack.isEmpty()) {
	    				isAble = true;
	    				break;
	    			}
	    			if(isNumber(stack.peek())) {
	    				num += Integer.parseInt(stack.pop());
	    			}
	    			else {
	    				if(isBrace(temp,stack.peek())) {
	    					stack.pop();
	    					int t = (")".equals(temp)) ? 2:3;
	    					
	    					if(num == 0) {
	    						stack.push(String.valueOf(t));
	    					}
	    					else {
	    						stack.push(String.valueOf(t*num));
	    					}
	    					break;
	    				}
	    				else {
	    					isAble = false;
	    					break;
	    				}
	    			}
	    			
	    		}
	    		if(!isAble) break;
	    	}
	    	int result = 0;
	    	while(!stack.isEmpty()) {
	    		if(isNumber(stack.peek())) {
	    			result += Integer.parseInt(stack.pop());
	    		}
	    		else {
	    			isAble = false;
	    			break;
	    		}
	    	}
	    	if(isAble) bw.write(String.valueOf(result));
	    	else bw.write(String.valueOf(0));
	    	br.close();
	    	bw.flush();
	    	bw.close();
	    }
	}