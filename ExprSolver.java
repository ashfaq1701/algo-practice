import java.util.*;
import java.util.regex.*;

public class ExprSolver {
	public static float solution(String expr) {
		Pattern firstNumber = Pattern.compile("^[+-]?\\d+(\\.\\d+)?");
		Pattern numbers = Pattern.compile("\\d+(\\.\\d+)?");
		Pattern ops = Pattern.compile("(?!^)[+-]");
		LinkedList<Float> numsList = new LinkedList<Float>();
		LinkedList<String> opsList = new LinkedList<String>();
		Matcher firstNumberMatcher = firstNumber.matcher(expr);
		Matcher numbersMatcher = numbers.matcher(expr);
		Matcher opsMatcher = ops.matcher(expr);
		
		while(firstNumberMatcher.find()) {
			numsList.add(Float.parseFloat(firstNumberMatcher.group()));
		}
		int count = 0;
		while (numbersMatcher.find()) {
			if (count > 0) {
				numsList.add(Float.parseFloat(numbersMatcher.group()));
			}
			count++;
		}
		while (opsMatcher.find()) {
			opsList.add(opsMatcher.group());
		}
		float init = numsList.poll();
		while (numsList.size() > 0 && opsList.size() > 0) {
			String op = opsList.poll();
			float num = numsList.poll();
			if (op.equals("+")) {
				init = init + num;
			} else if (op.equals("-")) {
				init = init - num;
			}
		}
		return init;
	}
	
	public static void main(String args[]) {
		String expr = args[0];
		float result = solution(expr);
		System.out.println(result);
	}
}
