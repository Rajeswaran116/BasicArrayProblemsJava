//7.	7. Reverse the array.
//•	   - Input/Output: [1, 2, 3, 4] → [4, 3, 2, 1]
//•	   - Input/Output: [7, 8] → [8, 7]

import java.util.*;
public class ReverseanArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(a));
		
		s.close();

	}

}
