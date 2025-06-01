//5.	5. Count the number of even numbers.
//•	   - Input/Output: [2, 3, 4, 5] → 2
//•	   - Input/Output: [1, 3, 5, 7] → 0
//6.	6. Count the number of odd numbers.
//•	   - Input/Output: [2, 3, 4, 5] → 2
//•	   - Input/Output: [1, 3, 5, 7] → 4

import java.util.*;
public class CountEvenandOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				ecount++;
			}
			else {
				ocount++;
			}
		}
		System.out.println("There are "+ecount+" even elements and "+ocount+" odd elements");
		
		s.close();

	}

}
