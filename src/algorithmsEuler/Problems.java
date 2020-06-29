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
	
	public long problemEigth() {
		String chain = "73167176531330624919225119674426574742355349194934"+
				"96983520312774506326239578318016984801869478851843"+
				"85861560789112949495459501737958331952853208805511"+
				"12540698747158523863050715693290963295227443043557"+
				"66896648950445244523161731856403098711121722383113"+
				"62229893423380308135336276614282806444486645238749"+
				"230358907296290491560440772390713810515859307960866"+
				"70172427121883998797908792274921901699720888093776"+
				"65727333001053367881220235421809751254540594752243"+
				"52584907711670556013604839586446706324415722155397"+
				"53697817977846174064955149290862569321978468622482"+
				"83972241375657056057490261407972968652414535100474"+
				"82166370484403199890008895243450658541227588666881"+
				"16427171479924442928230863465674813919123162824586"+
				"17866458359124566529476545682848912883142607690042"+
				"24219022671055626321111109370544217506941658960408"+
				"07198403850962455444362981230987879927244284909188"+
				"84580156166097919133875499200524063689912560717606"+
				"05886116467109405077541002256983155200055935729725"+
				"71636269561882670428252483600823257530420752963450";
		long mult = 1;
		long max = 0;
		
		for(int i = 0; i <= chain.length()-14;i++) {
			for(int j = i; j<=i+12;j++) {
				mult = mult*Character.getNumericValue(chain.charAt(j));
			}
			if(mult > max) {
				max = mult;
			}
			mult = 1;
		}		
		return max;
	}
	
	public int problemNine() {
		List terna;
		int a,b,c;
		for(int m = 500; m >= 2;m--) {
			for(int n = m-1; n >= 1; n--) {
				terna = problem.ternaPitagorica(n, m);
				a = (int)terna.get(0);
				b = (int)terna.get(1);
				c = (int)terna.get(2);
				if(a+b+c == 1000) {
					return a*b*c;
				}				

			}				
		}		
		
		return 0;
	}
	
	
}
