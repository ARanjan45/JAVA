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
	    System.out.println("Enter the edge length of a square: ");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i==0 || j==0 || i==n-1 || j==n-1)
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	        System.out.println("");
	    }
	}
}
