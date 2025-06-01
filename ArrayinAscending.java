//8.	8. Check if the array is sorted in ascending order.
//•	   - Input/Output: [1, 2, 3] → true
//•	   - Input/Output: [3, 2, 1] → false

import java.util.*;
public class ArrayinAscending {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		boolean flag=true;
		int previous=a[0];
		for(int i=1;i<a.length;i++) {
			if(previous <=a[i]) {
				previous=a[i];
			}
			else {
				flag=false;
				break;
			}
		}
		
		System.out.println(flag);
		
		s.close();

	}

}
