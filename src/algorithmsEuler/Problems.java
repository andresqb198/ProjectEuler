package algorithmsEuler;
import Math.Mathematics;

public class Problems {

	public int problemOne() {
		Mathematics problem = new Mathematics();
		return problem.sumDivBy(5, 999) + problem.sumDivBy(3, 999) -problem.sumDivBy(15, 999);
	}
}
