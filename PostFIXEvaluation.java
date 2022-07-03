package abc;

import java.util.Stack;

public class PostFIXEvaluation {

	public static void main(String[] args) {
		String exp="12+3*";
		
		System.out.println(evaluate(exp));
	}
	
	static String evaluate(String exp) {
		Stack<String> stack=new Stack<String>();
		String op="+-*/";
		for(char ch:exp.toCharArray()) {
			if(!op.contains(String.valueOf(ch)))
				stack.push(String.valueOf(ch));
			
			else {
			int idx=op.indexOf(ch);
			int a=Integer.valueOf(   stack.pop());
			int b=Integer.valueOf(	stack.pop());
			
			switch(idx) {
			case 0:
				stack.push(String.valueOf(  a+b));
				break;
			case 1:
				stack.push(String.valueOf(  a-b));
				break;
			case 2:
				stack.push(String.valueOf(  a*b));
				break;
			case 3:
				stack.push(String.valueOf(  a/b));
				break;
			
			}
			}
		}
		return stack.pop().toString();
	}

}
