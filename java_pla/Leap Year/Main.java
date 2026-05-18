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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		if(year%4!=0)
		    System.out.println("The year is not a leap year");
		else{
		    if((year%100)==0){
		        if((year%400)==0)
		            System.out.println("Leap Year");
		        else
		            System.out.println("Not a leap year");
		    }
		    else
		        System.out.println("Leap year");
		}
	}
}
