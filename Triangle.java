import java.util.Scanner;
class Triangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if(a == b && a == c){
			System.out.println("Equilateral");
		}else if(a == b || a == c || b == c){
			System.out.println("Isosceles");
		}else{
			System.out.println("Scalene");
		}
	}
}
