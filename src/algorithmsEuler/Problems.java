package algorithmsEuler;
import Math.Mathematics;

public class Problems {
	
	Mathematics problem = new Mathematics();
	
	public int problemOne() {
		
		return problem.sumDivBy(5, 999) + problem.sumDivBy(3, 999) -problem.sumDivBy(15, 999);
	}
	
	public int problemTwo() {
		int i = 0;
		int sum = 0;
		int fibonacciNumber = problem.generatorFibonacci(i);
		while(fibonacciNumber<= 4000000){
			if((fibonacciNumber % 2)==0) {
				sum += fibonacciNumber;
			}
			i++;
			fibonacciNumber = problem.generatorFibonacci(i);			
		}
		return sum;
		
	}
}
