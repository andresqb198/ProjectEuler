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
	
	public int problemFour() {
		int mult = 0;
		int halfString = 0;
		String number="";
		String firstSubString = "";
		String secondSubString = "";
		boolean eureka;
		int mayor = 0;
		for(int i = 999;i >= 100; i--) {
			for(int j = 999;j >= 100; j--) {
				eureka = true;
				mult = i*j;
				number = String.valueOf(mult);
				halfString = (int)number.length()/2;
				firstSubString = number.substring(0, halfString);
				secondSubString = number.substring(halfString, number.length());
				for(int k = 1; k <= halfString; k++) {
					if(firstSubString.charAt(k-1)!= secondSubString.charAt(secondSubString.length()-k)) {
						eureka = false;
						break;
					}
				}
				if(eureka) {
					if(mult > mayor) {
						mayor = mult;
					}
				}
				
			}
		}
		return mayor;

	}
	
	
	public int problemFive() {
		int initialNumber = 2520;
		boolean isDiv = false;
		while(!isDiv) {
			isDiv = true;
			initialNumber += 1;
			for(int i = 2; i<= 20; i++) {
				if(initialNumber%i != 0) {
					isDiv = false;
					break;
				}
			}			
		}
		return initialNumber;
	}
	
	public int problemSix() {
		int n = 100;
		int sumOfTheSquares = (int)Math.pow((n*(n+1))/2, 2);
		int squareOfTheSum = (n*(n+1)*(2*n+1))/6;
		return  sumOfTheSquares-squareOfTheSum;		
		
	}
	
	public int problemSeven() {
		return (int)this.problem.imprimirPrimos().get(10000);
	}
	
}
