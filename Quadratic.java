import java.util.*;
class Quadratic{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double D = b * b - 4 * a * c;
		if(D == 0){
			// calculate real and equal roots
		}else if(D > 0){
			// calculate real and unequal roots
		}else{
			// calculate imaginary roots
		}
	}
}
