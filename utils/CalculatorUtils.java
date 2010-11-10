/**
 * Created by Periklis Ntanasis (Master_ex) and Ivan Kanakarakis (c00kiemon5ter)
 * This is a demo for NetBeans IDE Swing drug n drop features designed
 * for a foss-aueb presentation
 */
package utils;

public class CalculatorUtils {

	public final static char ADD = '+', SUB = '-', MUL = '*', DIV = '/';
	private static char operator;
	private static int numA = -1, numB = -1;

	public static void setNumA(int num) {
		numA = num;
	}

	public static void setNumB(int num) {
		numB = num;
	}

	public static void setOperation(char operator) {
		CalculatorUtils.operator = operator;
	}

	public static String calculateResult() {
		return calculateResult(numA, operator, numB);
	}

	private static String calculateResult(int a, char operator, int b) {
		String result;
		switch (operator) {
			case ADD:
				result = String.valueOf(a + b);
				break;
			case SUB:
				result = String.valueOf(a - b);
				break;
			case MUL:
				result = String.valueOf(a * b);
				break;
			case DIV:
				if (b == 0) {
					result = "nan";
					break;
				}
				result = String.valueOf((float) a / b);
				break;
			default:
				result = "error";
		}
		return result;
	}
}
