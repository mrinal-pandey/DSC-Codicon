import java.util.Scanner;
class Array{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] a = {1, 2, 4, 5};
		int updateIndex = in.nextInt();
		int updateValue = in.nextInt();
		// check before updating array
		if(updateIndex < a.length && updateIndex > -1){
			a[updateIndex] = updateValue;
		}
		for(int i : a){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
