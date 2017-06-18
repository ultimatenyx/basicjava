import java.util.*;
class divtwonumdyn{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the divisor:");
		a = s.nextInt();
		System.out.println("Enter the dividend:");
		b = s.nextInt();
		c = b/a;
		System.out.println("Quotient is "+c);
	}
}