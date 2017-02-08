
public class Calculator {
	public int pressAdd(int a, int b){
		int equals = Math.addExact(a,b);
		return equals;
	}
	public int pressSubtract(int a, int b){
		int equals = Math.subtractExact(a,b);
		return equals;
	}
	public int pressMultiply(int a, int b){
		int equals = Math.multiplyExact(a,b);
		return equals;
	}
	public int pressDivide(int a, int b){
		double aF = (double) a;
		double bF = (double)b;
		int equals = (int) Math.round(aF/bF);
		return equals;
	}
	public static void main(String[] args){
	}
}
