//4.	4. Calculate the average of array elements.
//•	   - Input/Output: [2, 4, 6] → 4.0
//•	   - Input/Output: [1, 2, 3] → 2.0

import java.util.*;
public class AverageofElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]= new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		double avg=sum/a.length;
		System.out.println(avg);
		
		s.close();

	}

}
