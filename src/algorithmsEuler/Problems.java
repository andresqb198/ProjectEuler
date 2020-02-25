package algorithmsEuler;
import Math.Mathematics;
import Math.PrimeNumbers;
import java.util.ArrayList;
import java.util.List;

public class Problems {
	
	Mathematics problem = new Mathematics();
	PrimeNumbers primes = new PrimeNumbers();
	
	
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
	
	public int problemThree() {
		List<Integer> factores = new ArrayList();
		long  number = 600851475143L;
		for(int p:primes.under10ThousandPrimes()) {
			if(number%p == 0) {
				factores.add(p);
			}
		}
		return factores.get(factores.size()-1);
	}
}
