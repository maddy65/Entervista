package Reltio;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {

	public static void main(String[] args) {
		String expr = ")";
		if (bracketTest(expr))
			System.out.println("Correct ");
		else
			System.out.println("Not Correct ");
	}
	
	static boolean bracketTest(String expr)	{
		Deque<Character> stack 	= new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++)	{
			char x = expr.charAt(i);

			if (x == '('){
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	

}
