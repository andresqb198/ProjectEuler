package Math;
import java.lang.Math;

public class Mathematics {
	
	public int sumDivBy(int n, int target) {
		int p = target/n;
		return n*(p*(p+1))/ 2;		
	}
	
	public int generatorFibonacci(double n) {		
		return (int)(((1/Math.sqrt(5))*Math.pow(((1+Math.sqrt(5))/2), n))+0.5);
	}
	
}
