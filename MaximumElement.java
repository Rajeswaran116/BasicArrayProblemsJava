
//1.	1. Find the maximum element in the array.
//	   - Input/Output: [3, 1, 7, 9, 5] → 9
//     - Input/Output: [10, 20, 5] → 20

import java.util.*;
public class MaximumElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		
		System.out.println(max);
		
		s.close();

	}

}
