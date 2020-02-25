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
	
	public String imprimirPrimos(){
		List<Integer> primos = new ArrayList();
		Integer firstPrim = 2;
		boolean isPrimo = true;
		primos.add(firstPrim);
		for(Integer i = 3; i<=100000;i++) {
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
		String listaPrimos = "[";
		int ln = 2;
		for(Integer p:primos) {			
			listaPrimos= listaPrimos+String.valueOf(p)+',';
			if(ln%17==0) {
				listaPrimos = listaPrimos + "\n";
			}
			ln++;
			
		}
		listaPrimos= listaPrimos+"]";
		return listaPrimos;
	}
}
