package day10_collection;

import java.util.Stack;

public class Test01_stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		
		System.out.println(stack.peek()); //맨위에 뭐가 있는지 확인
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		

	}

}
