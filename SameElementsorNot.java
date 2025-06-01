//9.	9. Check if all elements are the same.
//•	   - Input/Output: [5, 5, 5] → true
//•	   - Input/Output: [1, 2, 1] → false
//

import java.util.*;
public class SameElementsorNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		boolean flag=true;
		int same=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i] !=same) {
				flag=false;
				break;
			}
		}
		
		System.out.println(flag);
		
		s.close();
	}

}
