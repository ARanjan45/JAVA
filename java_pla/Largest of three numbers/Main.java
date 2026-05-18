/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if ((a>b)  && (b>c))
		    System.out.println("Largest number is: "+a);
		else if((b>a)&&(b>c))
		    System.out.println("Largest Number is: "+b);
		else
		    System.out.println("Largest Number is:  "+c);
		    
		int largest=((a>b)&&(b>c)?a:((a<b)&&(b>c)?b:c));
		System.out.println("The largest number is "+largest);
	}
}
