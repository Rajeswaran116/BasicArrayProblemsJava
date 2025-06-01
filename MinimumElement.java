//2.	2. Find the minimum element in the array.
//•	   - Input/Output: [4, 2, 9, 1] → 1
//•	   - Input/Output: [8, 6, 3, 7] → 3

import java.util.*;
public class MinimumElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
		
		s.close();

	}

}
