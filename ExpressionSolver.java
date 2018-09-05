class ExpressionSolver {
	public static float solution(String str) {
		int idx;
		StringBuilder builder = new StringBuilder(str);
		String[] multiplicative = {"*", "/", "%"};
		String[] additive = {"+", "-"};
		while ((idx = searchSequentially(builder, multiplicative)) != -1) {
			builder = solveOperator(builder, idx);
		}
		while ((idx = searchSequentially(builder, additive)) != -1) {
			builder = solveOperator(builder, idx);
		}
		return Float.parseFloat(builder.toString());
	}

	public static StringBuilder solveOperator(StringBuilder str, int operIdx) {
		char[] operators = {'+', '-', '*', '/', '%'};
		char operator = str.charAt(operIdx);
		int first = operIdx - 1;
		int second = operIdx + 1;
		while ((first >= 0) && !inArray(operators, str.charAt(first))) {
			first = first - 1;
		}
		while ((second < str.length()) && !inArray(operators, str.charAt(second))) {
			second = second + 1;
		}
		float firstN = Float.parseFloat(str.substring(first + 1, operIdx));
		float secondN = Float.parseFloat(str.substring(operIdx + 1, second));
		float result = evaluate(firstN, secondN, operator);
		str = str.replace(first + 1, second, Float.toString(result));
		return str;
	}

	public static int searchSequentially(StringBuilder str, String[] arr) {
		for(String c : arr) {
			int idx = str.indexOf(c);
			if (idx != -1)
			{
				return idx;
			}
		}
		return -1;
	}

	public static boolean inArray(char[] arr, char c) {
		for (char ch : arr) {
			if (ch == c) {
				return true;
			}
		}
		return false;
	}

	public static float evaluate(float a, float b, char c) {
		float result = 0f;
		switch(c) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				result = a / b;
				break;
			case '%':
				result = a % b;
				break;
			default:
				result = 0f;		
		}
		return result;
	}

	public static void main(String args[]) {
		String expr = args[0];
		float result = solution(expr);
		System.out.println(result);
	}
}
