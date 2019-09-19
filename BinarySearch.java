import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4, 5, 6};
		int low = 0;
		int key = 4;
		int high = a.length - 1;
		int pos = -1;
		int mid = (low + high) / 2;
		while(pos == -1 && low <= high){
			mid = (low + high) / 2;
			if(a[mid] == key){
				pos = mid;
			}else if(a[mid] > key){
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		if(pos != -1){
			System.out.println("Key found at " + pos);
		}else{
			System.out.println("Better luck next time!");
		}
	}
}
