package Math;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Mathematics {
	
		
	public int sumDivBy(int n, int target) {
		int p = target/n;
		return n*(p*(p+1))/ 2;		
	}
	
	public int generatorFibonacci(double n) {		
		return (int)(((1/Math.sqrt(5))*Math.pow(((1+Math.sqrt(5))/2), n))+0.5);
	}
	
	public List ternaPitagorica(int n,int m) {
		List<Integer> terna = new ArrayList();
		int a,b,c;
		a = m*m-n*n;
		b = 2*m*n;
		c = m*m + n*n;
		terna.add(a);
		terna.add(b);
		terna.add(c);
		return terna;
	}
	
	public int GreatestProductMatrix(int matrix[][]) {
		int mayor,product;
		mayor = 0;
		for(int i=0;i<=19;i++) {
			for(int j=0;j<=19;j++) {
				product = analizeProductsElement(matrix,i,j);
				if(product > mayor) {
					mayor = product;
				}
			}
		}
		return mayor;
	}
	
	public int analizeProductsElement(int [][] matrix,int i,int j) {
		int diagonal1 = 1;
		int diagonal2 = 1;
		int horizontal = 1;
		int vertical = 1;
		int mayor = 0;
		for(int k = 0;k<=3;k++) {
			if(i+3<=19 && j+3<=19) {
				diagonal1 *= matrix[i+k][j+k];
			}
			if(i+3<=19 && j-3>=0) {
				diagonal2 *= matrix[i+k][j-k];
			}
			if(i+3 <=19) {
				vertical *= matrix[i+k][j];
			}
			if(j+3 <=19) {
				horizontal *= matrix[i][j+k];
			}		
		}
		if(diagonal1 > diagonal2) {
			mayor = diagonal1;
		}else if(diagonal2 > vertical) {
			mayor = diagonal2;
		}else if(vertical > horizontal) {
			mayor = vertical;
		}else {
			mayor = horizontal;
		}			
		
		return mayor;
	}
	
	
	public List imprimirPrimos(){
		List<Integer> primos = new ArrayList();
		Integer firstPrim = 2;
		boolean isPrimo = true;
		primos.add(firstPrim);
		for(Integer i = 3; i<=150000;i++) {
			for(Integer nprimo: primos) {
				if((i%nprimo)==0) {
					isPrimo = false;
					break;
				}
			}
			if(isPrimo) {
				primos.add(i);
			}
			isPrimo = true;
		}
		//String listaPrimos = "[";
		//int ln = 2;
		//for(Integer p:primos) {			
			//listaPrimos= listaPrimos+String.valueOf(p)+',';
			//if(ln%17==0) {
				//listaPrimos = listaPrimos + "\n";
			//}
			//ln++;
			
		//}
		//listaPrimos= listaPrimos+"]";
		return primos;	
		
	}
}
