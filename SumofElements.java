//3.	3. Calculate the sum of all elements.
//•	   - Input/Output: [2, 4, 6] → 12
//•	   - Input/Output: [1, 1, 1, 1] → 4

import java.util.*;
public class SumofElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		
		System.out.println(sum);
		
		s.close();

	}

}
